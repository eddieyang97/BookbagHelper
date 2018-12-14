To create the database, have the following files (which can be found under the SQL folder) in your desired folder:
create.sql
InsertComments.sql
InsertCourses.sql
InsertProfessors.sql
InsertTeaches.sql

Then, run the following commands in the command line:
createdb courses; psql courses -af create.sql; psql courses -af InsertCourses.sql; psql courses -af InsertProfessors.sql; psql courses -af InsertTeaches.sql; psql courses -af InsertComments.sql;
The courses database will then be set up and populated with data for our web app.

To set up the web app using command line:
Go into the play-courses folder;
Run sbt;
After compilation, enter run to run the web application;
Set up conf file to activate port 9000;
Open localhost:9000 in Internet Explorer to browse the application;

Currently, our system allows users to view and search through our database containing professor information, course information, and comments; however, we do not support allowing users to directly add more data into our database. We do allow users to contribute to our database through the google doc. We will clean up the data gathered through google doc and add it to our database periodically.