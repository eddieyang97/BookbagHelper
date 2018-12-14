CREATE TABLE Course
(name VARCHAR(128) NOT NULL PRIMARY KEY,
 course_number VARCHAR(128) NOT NULL
);

CREATE TABLE Professor
(name VARCHAR(64) NOT NULL PRIMARY KEY,
 gender VARCHAR(64),
 quality FLOAT,
 difficulty FLOAT,
 number_of_reviews INTEGER,
 url VARCHAR(256)
);

CREATE TABLE Teaches
(prof_name VARCHAR(128) NOT NULL REFERENCES Professor(name),
 sec_prof_name VARCHAR(128) REFERENCES Professor(name),
 semester VARCHAR(32),
 course_name VARCHAR(128) NOT NULL REFERENCES Course(name),
 pairingID VARCHAR(32) NOT NULL PRIMARY KEY
);

CREATE TABLE Comment
(pairingID VARCHAR(32) NOT NULL REFERENCES Teaches(pairingID),
 comment VARCHAR(2048) NOT NULL,
 PRIMARY KEY(pairingID, comment)
);

CREATE FUNCTION UpdateCommentNumber() RETURNS TRIGGER AS $$
BEGIN
  UPDATE Professor
  SET number_of_reviews = number_of_reviews + 1
  WHERE name = (SELECT prof_name FROM Teaches t WHERE t.pairingID = NEW.pairingID)
     OR name = (SELECT sec_prof_name FROM Teaches t WHERE t.pairingID = NEW.pairingID);
  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER TG_BrokerNotAccountOwner_Broker
  BEFORE INSERT ON Comment
  FOR EACH ROW
  EXECUTE PROCEDURE UpdateCommentNumber();
