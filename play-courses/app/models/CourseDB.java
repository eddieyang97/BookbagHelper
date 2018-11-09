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

    /*
    public DrinkerInfo getProfessorInfo(String name) throws SQLException {
        Connection connection = null;
        DrinkerInfo professorInfo = null;
        try {
            connection = db.getConnection();
            // retrieve basic info:
            PreparedStatement statement = connection
                .prepareStatement("SELECT address FROM drinker WHERE name = ?");
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            if (! rs.next()) {
                return null;
            }
            String address = rs.getString(1);
            rs.close();
            statement.close();
            // retrieve beers liked:
            statement = connection
                .prepareStatement("SELECT beer FROM Likes WHERE drinker =?");
            statement.setString(1, name);
            rs = statement.executeQuery();
            ArrayList<String> beers = new ArrayList<String>();
            while (rs.next()) {
                String beer = rs.getString(1);
                beers.add(beer);
            }
            rs.close();
            statement.close();
            // retrieve bars frequented:
            statement = connection
                .prepareStatement("SELECT bar, times_a_week" +
                                  " FROM Frequents" +
                                  " WHERE drinker = ?");
            statement.setString(1, name);
            rs = statement.executeQuery();
            ArrayList<String> bars = new ArrayList<String>();
            ArrayList<Integer> times = new ArrayList<Integer>();
            while (rs.next()) {
                String bar = rs.getString(1);
                bars.add(bar);
                int times_a_week = rs.getInt(2);
                times.add(times_a_week);
            }
            rs.close();
            statement.close();
            drinkerInfo = new DrinkerInfo(name, address, beers, bars, times);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                }
            }
        }
        return drinkerInfo;
    }

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
