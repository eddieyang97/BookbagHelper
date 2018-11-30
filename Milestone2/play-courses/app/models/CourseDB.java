package models;

import play.db.*;
import javax.inject.*;
import java.sql.*;
import javax.sql.*;
import java.util.ArrayList;

@Singleton
public class CourseDB {

    public static class ProfessorInfo {
        public String name = null; 
        public String gender = null; 
        public Double quality = null; 
        public Double difficulty = null; 
        public Integer numberOfReviews = null; 
        public String url = null; 
        public ProfessorInfo() {
        }
        public ProfessorInfo(String name,
                             String gender,
                             Double quality,
                             Double difficulty,
                             Integer numberOfReviews,
                             String url) {
            this.name = name;
            this.gender = gender;
            this.quality = quality;
            this.difficulty = difficulty;
            this.numberOfReviews = numberOfReviews;
            this.url = url;
        }
    }

    private Database db;

    @Inject
    public CourseDB(Database db) {
        this.db = db;
    }

    public ArrayList<String> getAllNames(String table) throws SQLException {
        assert table.equals("Course")
            || table.equals("Professor");
        Connection connection = null;
        ArrayList<String> names = new ArrayList<String>();
        try {
            connection = db.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement
                .executeQuery("SELECT name FROM " + table + " ORDER BY name");
            while (rs.next()) {
                String name = rs.getString(1);
                names.add(name);
            }
            rs.close();
            statement.close();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                }
            }
        }
        return names;
    }
    
    public ArrayList<String> getAllProfessorNames() throws SQLException {
        return getAllNames("Professor");
    }

    public ArrayList<String> getAllCourseNames() throws SQLException {
        return getAllNames("Course");
    }

    
    public ProfessorInfo getProfessorInfo(String name) throws SQLException {
        Connection connection = null;
        ProfessorInfo professorInfo = null;
        try {
            connection = db.getConnection();
            // retrieve gender info 
            PreparedStatement statement = connection
                .prepareStatement("SELECT gender FROM professor WHERE name = ?");
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            if (! rs.next()) {
                return null;
            }
            String gender = rs.getString(1);
            rs.close();
            statement.close();
            // retrieve quality info:
            statement = connection
                .prepareStatement("SELECT quality FROM professor WHERE name = ?");
            statement.setString(1, name);
            rs = statement.executeQuery();
            if (! rs.next()) {
                return null;
            }
            Double quality = rs.getDouble(1);
            rs.close();
            statement.close();
            // retrieve difficulty info:
            statement = connection
                .prepareStatement("SELECT difficulty FROM professor WHERE name =?");
            statement.setString(1, name);
            rs = statement.executeQuery();
            if (! rs.next()) {
                return null;
            }
            Double difficulty = rs.getDouble(1);
            rs.close();
            statement.close();
            // retrieve number_of_reviews info:
            statement = connection
                .prepareStatement("SELECT number_of_reviews FROM professor WHERE name =?");
            statement.setString(1, name);
            rs = statement.executeQuery();
            if (! rs.next()) {
                return null;
            }
            int number_of_reviews = rs.getInt(1);
            rs.close();
            statement.close();
            // retrieve url info:
            statement = connection
                .prepareStatement("SELECT url FROM professor WHERE name =?");
            statement.setString(1, name);
            rs = statement.executeQuery();
            if (! rs.next()) {
                return null;
            }
            String url = rs.getString(1);
            rs.close();
            statement.close();
            professorInfo = new ProfessorInfo(name, gender, quality, difficulty, number_of_reviews, url);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                }
            }
        }
        return professorInfo;
    }

    /*
    public boolean updateDrinkerInfo(DrinkerInfo drinkerInfo)
        throws SQLException {
        Connection connection = null;
        boolean oldAutoCommitState = true;
        boolean success = false;
        try {
            connection = db.getConnection();
            oldAutoCommitState = connection.getAutoCommit();
            connection.setAutoCommit(false);
            // update basic info:
            PreparedStatement statement = connection
                .prepareStatement("UPDATE drinker SET address = ? WHERE name = ?");
            statement.setString(1, drinkerInfo.address);
            statement.setString(2, drinkerInfo.name);
            success = (statement.executeUpdate() == 1);
            statement.close();
            if (! success) {
                connection.rollback();
                return false;
            }
            // delete old beers liked:
            statement = connection
                .prepareStatement("DELETE FROM Likes WHERE drinker = ?");
            statement.setString(1, drinkerInfo.name);
            statement.executeUpdate();
            statement.close();
            // add new beers liked:
            statement = connection
                .prepareStatement("INSERT INTO Likes VALUES(?, ?)");
            for (String beer: drinkerInfo.beersLiked) {
                statement.setString(1, drinkerInfo.name);
                statement.setString(2, beer);
                statement.executeUpdate();
            }
            statement.close();
            // delete old bars frequented:
            statement = connection
                .prepareStatement("DELETE FROM Frequents WHERE drinker = ?");
            statement.setString(1, drinkerInfo.name);
            statement.executeUpdate();
            statement.close();
            // add new bars frequented:
            statement = connection
                .prepareStatement("INSERT INTO Frequents VALUES(?, ?, ?)");
            for (int i=0; i<drinkerInfo.barsFrequented.size(); i++) {
                statement.setString(1, drinkerInfo.name);
                statement.setString(2, drinkerInfo.barsFrequented.get(i));
                statement.setInt(3, drinkerInfo.timesFrequented.get(i));
                statement.executeUpdate();
            }
            statement.close();
            connection.commit();
        } finally {
            if (connection != null) {
                try {
                    connection.setAutoCommit(oldAutoCommitState);
                    connection.close();
                } catch (Exception e) {
                }
            }
        }
        return success;
    }
    */
}
