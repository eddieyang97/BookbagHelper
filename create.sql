CREATE TABLE Phone
(name VARCHAR(64) NOT NULL PRIMARY KEY,
 price FLOAT NOT NULL,
 released_date DATE,
 weight FLOAT,
 screen_size FLOAT,
 CPU VARCHAR(64),
 GPS VARCHAR(64),
 battery_size FLOAT,
 front_camera_resolution FLOAT,
 back_camera_resolution FLOAT,
 OS VARCHAR(64),
 RAM INTEGER,
 memory INTEGER,
 specialty VARCHAR(128)
);

CREATE TABLE Company
(name VARCHAR(64) NOT NULL PRIMARY KEY,
 market_value FLOAT,
 origin VARCHAR(64),
 found_date DATE,
 founder VARCHAR(64)
);

CREATE TABLE RatingWebsite
(URL VARCHAR(128) NOT NULL PRIMARY KEY,
 name VARCHAR(64) NOT NULL
);

CREATE TABLE Madeby
(phone_name VARCHAR(64) NOT NULL PRIMARY KEY,
 FOREIGN KEY(phone_name) REFERENCES Phone(name),
 company_name VARCHAR(64),
 FOREIGN KEY(company_name) REFERENCES Company(name)
);

CREATE TABLE Ratedby
(phone_name VARCHAR(64),
 FOREIGN KEY(phone_name) REFERENCES Phone(name),
 websiteURL VARCHAR(64),
 FOREIGN KEY(websiteURL) REFERENCES RatingWebsite(URL),
 PRIMARY KEY(phone_name,websiteURL),
 rating FLOAT,
);

INSERT INTO Phone VALUES ('iPhone XS MAX', 1099, '2018-09-21', 208, 102.9, 'Hexa-core (2x Vortex + 4x Tempest)', 'Yes', 3174, 7, 12, 'iOS 12', 4, 512, NULL);
INSERT INTO Phone VALUES ('iPhone 7', 849, '2016-09-22', 138, 60.9, 'Quad-core 2.34 GHz', 'Yes', 1960, 7, 12, 'iOS 10.0.1', 2, 256, NULL);
INSERT INTO Company VALUES ('Apple',  '1040000', 'USA', '1974-04-01', 'Steve Jobs');
INSERT INTO Madeby VALUES ('iPhone 7', 'Apple');
