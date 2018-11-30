CREATE TABLE Course
(name VARCHAR(128) NOT NULL PRIMARY KEY,
 course_number VARCHAR(128) NOT NULL
);

CREATE TABLE Crosslisting
(course_number VARCHAR(128) NOT NULL REFERENCES Course(course_number),
 course_number_secondary VARCHAR(128) NOT NULL PRIMARY KEY
)

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
 sec_prof_name VARCHAR(128) NOT NULL REFERENCES Professor(name),
 semester VARCHAR(32),
 course_name VARCHAR(128) NOT NULL REFERENCES Course(name),
 pairingID VARCHAR(32) NOT NULL PRIMARY KEY
);

CREATE TABLE Comment
(pairingID VARCHAR(32) NOT NULL REFERENCES Teaches(pairingID),
 comment VARCHAR(1024) NOT NULL,
 PRIMARY KEY(pairingID, comment)
);

INSERT INTO Course VALUES ('Modern Chinese Culture', 'CHINESE 455');
INSERT INTO Course VALUES ('Chinese Society', 'CHINESE 456');
INSERT INTO Crosslisting VALUES ('CHINESE 456', 'AMES 456');
INSERT INTO Professor VALUES ('Kang Liu', 'Male', 3.5, 1.7, 3);
INSERT INTO Professor VALUES('Owen Astrachan', 'Male', 4.0, 2.5, 7);
INSERT INTO Professor VALUES('Carlo Tomasi', 'Male', 4.5, 3.1, 7);
INSERT INTO Teaches VALUES('Kang Liu', '2018F', 'Modern Chinese Culture', '00001');
INSERT INTO Teaches VALUES('Kang Liu', '2018S', 'Chinese Society', '00002');
INSERT INTO Comment VALUEs('00001', 'Very interesting course. Learned a lot. Decent Workload.');
INSERT INTO Comment VALUEs('00001', 'I liked it a lot. The weekly assignments are interesting and the projects are fun as well');
INSERT INTO Comment VALUEs('00002', 'A little hard; one essay every week; Prof. Liu is a great lecturer though.');
