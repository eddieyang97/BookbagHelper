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
 comment VARCHAR(1024) NOT NULL,
 PRIMARY KEY(pairingID, comment)
);

/*CREATE FUNCTION UpdateCommentNumber() RETURNS TRIGGER AS $$
BEGIN
  IF (TG_TABLE_NAME = 'broker' AND (NEW.ssn IN (SELECT ssn FROM Owns))) THEN
    RAISE EXCEPTION 'Account owners cannot be brokers';
  ELSIF (TG_TABLE_NAME = 'owns' AND (NEW.ssn IN (SELECT ssn FROM Broker))) THEN
    RAISE EXCEPTION 'Brokers cannot own accounts';
  END IF;
  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER TG_BrokerNotAccountOwner_Broker
  BEFORE INSERT ON Comment
  -- note that DELETE won't cause a violation
  FOR EACH ROW
  EXECUTE PROCEDURE UpdateCommentNumber();
*/
