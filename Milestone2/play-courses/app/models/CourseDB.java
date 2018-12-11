package models;

import play.db.*;
import javax.inject.*;
import java.sql.*;
import javax.sql.*;
import java.util.ArrayList;

@Singleton
public class CourseDB {
    public static boolean nameOrder = false;
    public static boolean qualityOrder = false;
    public static boolean difficultyOrder = false;

    public static class ProfessorInfo {
        public String name = null; 
        public String gender = null; 
        public Double quality = null; 
        public Double difficulty = null; 
        public Integer numberOfReviews = null; 
        public String url = null; 
        public ArrayList<String> teaches = null; 
        public ProfessorInfo() {
        }
        public ProfessorInfo(String name,
                             String gender,
                             Double quality,
                             Double difficulty,
                             Integer numberOfReviews,
                             String url,
                             ArrayList<String> teaches) {
            this.name = name;
            this.gender = gender;
            this.quality = quality;
            this.difficulty = difficulty;
            this.numberOfReviews = numberOfReviews;
            this.url = url;
            this.teaches = teaches;
        }
    }

    public static class CourseInfo {
        public String name = null;
        public String courseNumber = null;
        public ArrayList<String> taughtBy = null; 
        public CourseInfo() {
        }
        public CourseInfo(String name,
                          String courseNumber,
                          ArrayList<String> taughtBy) {
            this.name = name;
            this.courseNumber = courseNumber;
            this.taughtBy = taughtBy; 
        }

    }

    public static class CommentInfo {
        public String profName = null;
        public String secProfName = null; 
        public String semester = null; 
        public String courseName = null; 
        public String comment = null; 
        public CommentInfo() {
        }
        public CommentInfo(String profName,
                           String secProfName,
                           String semester,
                           String courseName,
                           String comment) {
            this.profName = profName;
            this.secProfName = secProfName;
            this.semester = semester;
            this.courseName = courseName;
            this.comment = comment;
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

    public ArrayList<ProfessorInfo> getAllMatchedProfessors(String subname) throws SQLException {
        Connection connection = null;
        ArrayList<ProfessorInfo> profs = new ArrayList<ProfessorInfo>();
        try {
            connection = db.getConnection();
            PreparedStatement statement = connection
                .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor WHERE UPPER(name) LIKE UPPER(?)");
            statement.setString(1, "%" + subname + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                Double difficulty = rs.getDouble(2);
                Double quality = rs.getDouble(3);
                Integer number_of_reviews = rs.getInt(4);
                ProfessorInfo prof = new ProfessorInfo(name, null, quality, difficulty, number_of_reviews, null, null);
                profs.add(prof);
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
        return profs;
    }

    public ArrayList<ProfessorInfo> getAllMatchedProfessorsSortByName(String subname) throws SQLException {
        Connection connection = null;
        ArrayList<ProfessorInfo> profs = new ArrayList<ProfessorInfo>();
        try {
            connection = db.getConnection();
            nameOrder = !nameOrder;
            PreparedStatement statement = null; 
            if (nameOrder) {
                statement = connection
                    .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor WHERE UPPER(name) LIKE UPPER(?) ORDER BY name");
            } else {
                statement = connection
                    .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor WHERE UPPER(name) LIKE UPPER(?) ORDER BY name DESC");
            }
            statement.setString(1, "%" + subname + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                Double difficulty = rs.getDouble(2);
                Double quality = rs.getDouble(3);
                Integer number_of_reviews = rs.getInt(4);
                ProfessorInfo prof = new ProfessorInfo(name, null, quality, difficulty, number_of_reviews, null, null);
                profs.add(prof);
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
        return profs;
    }

    public ArrayList<ProfessorInfo> getAllProfessorsSortByName() throws SQLException {
        Connection connection = null;
        ArrayList<ProfessorInfo> profs = new ArrayList<ProfessorInfo>();
        try {
            connection = db.getConnection();
            nameOrder = !nameOrder;
            PreparedStatement statement = null; 
            if (nameOrder) {
                statement = connection
                    .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor ORDER BY name");
            } else {
                statement = connection
                    .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor ORDER BY name DESC");
            }
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                Double difficulty = rs.getDouble(2);
                Double quality = rs.getDouble(3);
                Integer number_of_reviews = rs.getInt(4);
                ProfessorInfo prof = new ProfessorInfo(name, null, quality, difficulty, number_of_reviews, null, null);
                profs.add(prof);
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
        return profs;
    }

    public ArrayList<ProfessorInfo> getAllProfessorsSortByQuality() throws SQLException {
        Connection connection = null;
        ArrayList<ProfessorInfo> profs = new ArrayList<ProfessorInfo>();
        try {
            connection = db.getConnection();
            qualityOrder = !qualityOrder;
            PreparedStatement statement = null; 
            if (qualityOrder) {
                statement = connection
                    .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor ORDER BY quality");
            } else {
                statement = connection
                    .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor ORDER BY quality DESC");
            }
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                Double difficulty = rs.getDouble(2);
                Double quality = rs.getDouble(3);
                Integer number_of_reviews = rs.getInt(4);
                ProfessorInfo prof = new ProfessorInfo(name, null, quality, difficulty, number_of_reviews, null, null);
                profs.add(prof);
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
        return profs;
    }

    public ArrayList<ProfessorInfo> getAllProfessorsSortByDifficulty() throws SQLException {
        Connection connection = null;
        ArrayList<ProfessorInfo> profs = new ArrayList<ProfessorInfo>();
        try {
            connection = db.getConnection();
            difficultyOrder = !difficultyOrder;
            PreparedStatement statement = null; 
            if (difficultyOrder) {
                statement = connection
                    .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor ORDER BY difficulty");
            } else {
                statement = connection
                    .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor ORDER BY difficulty DESC");
            }
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                Double difficulty = rs.getDouble(2);
                Double quality = rs.getDouble(3);
                Integer number_of_reviews = rs.getInt(4);
                ProfessorInfo prof = new ProfessorInfo(name, null, quality, difficulty, number_of_reviews, null, null);
                profs.add(prof);
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
        return profs;
    }

    public ArrayList<ProfessorInfo> getAllMatchedProfessorsSortByQuality(String subname) throws SQLException {
        Connection connection = null;
        ArrayList<ProfessorInfo> profs = new ArrayList<ProfessorInfo>();
        try {
            connection = db.getConnection();
            qualityOrder = !qualityOrder;
            PreparedStatement statement = null; 
            if (qualityOrder) {
                statement = connection
                        .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor WHERE UPPER(name) LIKE UPPER(?) ORDER BY quality");
            } else {
                statement = connection
                        .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor WHERE UPPER(name) LIKE UPPER(?) ORDER BY quality DESC");
            }
            statement.setString(1, "%" + subname + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                Double difficulty = rs.getDouble(2);
                Double quality = rs.getDouble(3);
                Integer number_of_reviews = rs.getInt(4);
                ProfessorInfo prof = new ProfessorInfo(name, null, quality, difficulty, number_of_reviews, null, null);
                profs.add(prof);
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
        return profs;
    }

    public ArrayList<ProfessorInfo> getAllMatchedProfessorsSortByDifficulty(String subname) throws SQLException {
        Connection connection = null;
        ArrayList<ProfessorInfo> profs = new ArrayList<ProfessorInfo>();
        try {
            connection = db.getConnection();
            PreparedStatement statement = null;
            difficultyOrder = !difficultyOrder;
            if (difficultyOrder) {
                statement = connection
                    .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor WHERE UPPER(name) LIKE UPPER(?) ORDER BY difficulty");
            } else {
                statement = connection
                    .prepareStatement("SELECT name, difficulty, quality, number_of_reviews FROM professor WHERE UPPER(name) LIKE UPPER(?) ORDER BY difficulty DESC");
            }
            statement.setString(1, "%" + subname + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                Double difficulty = rs.getDouble(2);
                Double quality = rs.getDouble(3);
                Integer number_of_reviews = rs.getInt(4);
                ProfessorInfo prof = new ProfessorInfo(name, null, quality, difficulty, number_of_reviews, null, null);
                profs.add(prof);
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
        return profs;
    }

    public ArrayList<String> getAllMatchedCourses(String subname) throws SQLException {
        Connection connection = null;
        ArrayList<String> names = new ArrayList<String>();
        try {
            connection = db.getConnection();
            PreparedStatement statement = connection
                .prepareStatement("SELECT name FROM course WHERE UPPER(name) LIKE UPPER(?)");
            statement.setString(1, "%" + subname + "%");
            ResultSet rs = statement.executeQuery();
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
                .prepareStatement("SELECT difficulty FROM professor WHERE name = ?");
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
                .prepareStatement("SELECT number_of_reviews FROM professor WHERE name = ?");
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
                .prepareStatement("SELECT url FROM professor WHERE name = ?");
            statement.setString(1, name);
            rs = statement.executeQuery();
            if (! rs.next()) {
                return null;
            }
            String url = rs.getString(1);
            rs.close();
            statement.close();
            // retrieve teaches info
            statement = connection
                .prepareStatement("SELECT DISTINCT course_name FROM Teaches t, comment c WHERE t.pairingID = c.pairingID AND (prof_name = ? OR sec_prof_name = ?)");
            statement.setString(1, name);
            statement.setString(2, name);
            rs = statement.executeQuery();
            ArrayList<String> teaches = new ArrayList<String>();
            while (rs.next()) {
                String course_name = rs.getString(1);
                teaches.add(course_name);
            }
            rs.close();
            statement.close();
            professorInfo = new ProfessorInfo(name, gender, quality, difficulty, number_of_reviews, url, teaches);
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

    public CourseInfo getCourseInfo(String name) throws SQLException {
        Connection connection = null;
        CourseInfo courseInfo = null;
        try {
            connection = db.getConnection();
            // retrieve course_number info 
            PreparedStatement statement = connection
                .prepareStatement("SELECT course_number FROM course WHERE name = ?");
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            if (! rs.next()) {
                return null;
            }
            String courseNumber = rs.getString(1);
            rs.close();
            statement.close();
            // retrieve all professors that have taught this course 
            statement = connection
                .prepareStatement("SELECT DISTINCT prof_name FROM teaches WHERE course_name = ?");
            statement.setString(1, name);
            rs = statement.executeQuery();
            ArrayList<String> prof_names = new ArrayList<String>();
            while (rs.next()) {
                String prof_name = rs.getString(1);
                prof_names.add(prof_name);
            }
            rs.close();
            statement.close();
            courseInfo = new CourseInfo(name, courseNumber, prof_names);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                }
            }
        }
        return courseInfo;
    }

    public ArrayList<CommentInfo> getCommentsInfo(String prof_name, String course_name) throws SQLException {
        Connection connection = null;
        ArrayList<CommentInfo> commentsInfo = null;
        try {
            connection = db.getConnection();
            // retrieve course_number info 
            PreparedStatement statement = connection
                .prepareStatement("SELECT DISTINCT sec_prof_name, semester, comment FROM teaches t, comment c WHERE t.pairingID = c.pairingID AND prof_name = ? AND course_name = ?");
            statement.setString(1, prof_name);
            statement.setString(2, course_name);
            ResultSet rs = statement.executeQuery();
            commentsInfo = new ArrayList<CommentInfo>();
            while (rs.next()) {
                String sec_prof_name = rs.getString(1);
                String semester = rs.getString(2);
                String comment = rs.getString(3);
                CommentInfo commentInfo = new CommentInfo(prof_name, sec_prof_name, semester, course_name, comment);
                commentsInfo.add(commentInfo);
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
        return commentsInfo;
    }

    public ArrayList<CommentInfo> getCommentsInfoByProf(String prof_name) throws SQLException {
        Connection connection = null;
        ArrayList<CommentInfo> commentsInfo = null;
        try {
            connection = db.getConnection();
            // retrieve course_number info 
            PreparedStatement statement = connection
                .prepareStatement("SELECT DISTINCT sec_prof_name, semester, course_name, comment FROM teaches t, comment c WHERE t.pairingID = c.pairingID AND prof_name = ?");
            statement.setString(1, prof_name);
            ResultSet rs = statement.executeQuery();
            commentsInfo = new ArrayList<CommentInfo>();
            while (rs.next()) {
                String sec_prof_name = rs.getString(1);
                String semester = rs.getString(2);
                String course_name = rs.getString(3);
                String comment = rs.getString(4);
                CommentInfo commentInfo = new CommentInfo(prof_name, sec_prof_name, semester, course_name, comment);
                commentsInfo.add(commentInfo);
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
        return commentsInfo;
    }

    public ArrayList<CommentInfo> getCommentsInfoByCourse(String course_name) throws SQLException {
        Connection connection = null;
        ArrayList<CommentInfo> commentsInfo = null;
        try {
            connection = db.getConnection();
            // retrieve course_number info 
            PreparedStatement statement = connection
                .prepareStatement("SELECT DISTINCT prof_name, sec_prof_name, semester, comment FROM teaches t, comment c WHERE t.pairingID = c.pairingID AND course_name = ?");
            statement.setString(1, course_name);
            ResultSet rs = statement.executeQuery();
            commentsInfo = new ArrayList<CommentInfo>();
            while (rs.next()) {
                String prof_name = rs.getString(1);
                String sec_prof_name = rs.getString(2);
                String semester = rs.getString(3);
                String comment = rs.getString(4);
                CommentInfo commentInfo = new CommentInfo(prof_name, sec_prof_name, semester, course_name, comment);
                commentsInfo.add(commentInfo);
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
        return commentsInfo;
    }

    public ArrayList<CommentInfo> getCommentsInfoByCourseAndSemester(String course_name, String semester) throws SQLException {
        Connection connection = null;
        ArrayList<CommentInfo> commentsInfo = null;
        try {
            connection = db.getConnection();
            // retrieve course_number info 
            PreparedStatement statement = connection
                .prepareStatement("SELECT DISTINCT prof_name, sec_prof_name, comment FROM teaches t, comment c WHERE t.pairingID = c.pairingID AND course_name = ? AND semester = ?");
            statement.setString(1, course_name);
            statement.setString(2, semester);
            ResultSet rs = statement.executeQuery();
            commentsInfo = new ArrayList<CommentInfo>();
            while (rs.next()) {
                String prof_name = rs.getString(1);
                String sec_prof_name = rs.getString(2);
                String comment = rs.getString(3);
                CommentInfo commentInfo = new CommentInfo(prof_name, sec_prof_name, semester, course_name, comment);
                commentsInfo.add(commentInfo);
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
        return commentsInfo;
    }

}
