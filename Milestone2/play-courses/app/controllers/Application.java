package controllers;

import java.sql.SQLException;
import java.util.Map;
import java.util.ArrayList;
import javax.inject.Inject;

import play.*;
import play.mvc.*;
import play.data.*;

import views.html.*;

import models.CourseDB;

public class Application extends Controller {
    @Inject
    private FormFactory formFactory;
    @Inject
    private models.CourseDB courseDB;

    public Result index() throws SQLException {
        return ok(index.render());
    }

    public Result viewProfessor(String name) throws SQLException {
        CourseDB.ProfessorInfo professorInfo = courseDB.getProfessorInfo(name);
        if (professorInfo == null) {
            return ok(error.render("No professor named \"" + name + "\""));
        } else{
            return ok(professor.render(professorInfo));
        }
    }

    public Result viewCourse(String name) throws SQLException {
        CourseDB.CourseInfo courseInfo = courseDB.getCourseInfo(name);
        if (courseInfo == null) {
            return ok(error.render("No course named \"" + name + "\""));
        } else{
            return ok(course.render(courseInfo));
        }
    }

    public Result viewCommentsFilteredByProfessorAndCourse(String prof_name, String course_name) throws SQLException {
        ArrayList<CourseDB.CommentInfo> commentsInfo = courseDB.getCommentsInfo(prof_name, course_name);
        if (commentsInfo == null) {
            return ok(error.render("No comments found for the course \"" + course_name + "\"" + "taught by \"" + prof_name));
        } else {
            return ok(comments.render(commentsInfo));
        }
    }

    public Result viewCommentsFilteredByProfessor(String prof_name) throws SQLException {
        ArrayList<CourseDB.CommentInfo> commentsInfo = courseDB.getCommentsInfoByProf(prof_name);
        if (commentsInfo == null) {
            return ok(error.render("No comments found for the professor \"" + prof_name));
        } else {
            return ok(comments.render(commentsInfo));
        }
    }

    public Result viewCommentsFilteredByCourse(String course_name) throws SQLException {
        ArrayList<CourseDB.CommentInfo> commentsInfo = courseDB.getCommentsInfoByCourse(course_name);
        if (commentsInfo == null) {
            return ok(error.render("No comments found for the course \"" + course_name));
        } else {
            return ok(comments.render(commentsInfo));
        }
    }

    public Result viewCommentsFilteredByCourseAndSemester(String course_name, String semester) throws SQLException {
        ArrayList<CourseDB.CommentInfo> commentsInfo = courseDB.getCommentsInfoByCourseAndSemester(course_name, semester);
        if (commentsInfo == null) {
            return ok(error.render("No comments found for the course \"" + course_name + "\"" + "offered in \"" + semester));
        } else {
            return ok(comments.render(commentsInfo));
        }
    }

    public Result searchProfessor() throws SQLException {
        Map<String, String> data = formFactory.form().bindFromRequest().data();
        String name = data.get("professor");
        ArrayList<CourseDB.ProfessorInfo> profs = courseDB.getAllMatchedProfessors(name);
        return ok(searchProf.render(name, profs));
    }

    public Result searchAllProfessor() throws SQLException {
        ArrayList<CourseDB.ProfessorInfo> profs = courseDB.getAllMatchedProfessors("");
        return ok(searchAllProf.render(profs));
    }

    public Result searchAllCourse() throws SQLException {
        ArrayList<CourseDB.CourseInfo> courses = courseDB.getAllMatchedCourses("");
        return ok(searchCour.render(courses));
    }

    public Result searchProfessorSortByName(String name) throws SQLException {
        ArrayList<CourseDB.ProfessorInfo> profs = courseDB.getAllMatchedProfessorsSortByName(name);
        if (profs == null) {
            return ok(error.render("Invalid Professor Info"));
        } else {
            return ok(searchProf.render(name, profs));
        }
    }

    public Result searchAllProfessorSortByName() throws SQLException {
        ArrayList<CourseDB.ProfessorInfo> profs = courseDB.getAllProfessorsSortByName();
        if (profs == null) {
            return ok(error.render("Invalid Professor Info"));
        } else {
            return ok(searchAllProf.render(profs));
        }
    }
    
    public Result searchAllProfessorSortByQuality() throws SQLException {
        ArrayList<CourseDB.ProfessorInfo> profs = courseDB.getAllProfessorsSortByQuality();
        if (profs == null) {
            return ok(error.render("Invalid Professor Info"));
        } else {
            return ok(searchAllProf.render(profs));
        }
    }

    public Result searchAllProfessorSortByDifficulty() throws SQLException {
        ArrayList<CourseDB.ProfessorInfo> profs = courseDB.getAllProfessorsSortByDifficulty();
        if (profs == null) {
            return ok(error.render("Invalid Professor Info"));
        } else {
            return ok(searchAllProf.render(profs));
        }
    }

    public Result searchProfessorSortByQuality(String name) throws SQLException {
        ArrayList<CourseDB.ProfessorInfo> profs = courseDB.getAllMatchedProfessorsSortByQuality(name);
        if (profs == null) {
            return ok(error.render("Invalid Professor Info"));
        } else {
            return ok(searchProf.render(name, profs));
        }
    }

    public Result searchProfessorSortByDifficulty(String name) throws SQLException {
        ArrayList<CourseDB.ProfessorInfo> profs = courseDB.getAllMatchedProfessorsSortByDifficulty(name);
        if (profs == null) {
            return ok(error.render("Invalid Professor Info"));
        } else {
            return ok(searchProf.render(name, profs));
        }
    }
    
    public Result searchCourse() throws SQLException {
        Map<String, String> data = formFactory.form().bindFromRequest().data();
        String name = data.get("course");
        if (name == null) {
            return ok(error.render("Invalid Course Name")); 
        }
        ArrayList<CourseDB.CourseInfo> courses = courseDB.getAllMatchedCourses(name);
        return ok(searchCour.render(courses));
    }
    /*
    public Result editDrinker(String name) throws SQLException {
        BeerDB.DrinkerInfo drinkerInfo = beerDB.getDrinkerInfo(name);
        if (drinkerInfo == null) {
            return ok(error.render("No drinker named \"" + name + "\""));
        } else{
            return ok(edit.render(drinkerInfo,
                                  beerDB.getAllBeerNames(),
                                  beerDB.getAllBarNames()));
        }
    }

    public Result updateDrinker() throws SQLException {
        Map<String, String> data = formFactory.form().bindFromRequest().data();
        String name = data.get("name");
        String address = data.get("address");
        if (name == null || address == null) {
            return ok(error.render("Bad request"));
        }
        BeerDB.DrinkerInfo drinkerInfo = beerDB.getDrinkerInfo(name);
        if (drinkerInfo == null) {
            return ok(error.render("No drinker named \"" + name + "\""));
        }
        ArrayList<String> beersLiked = new ArrayList<String>();
        ArrayList<String> barsFrequented = new ArrayList<String>();
        ArrayList<Integer> timesFrequented = new ArrayList<Integer>();
        for (Map.Entry<String, String> entry: data.entrySet()) {
            if (entry.getKey().startsWith("BeersLiked/")) {
                beersLiked.add(entry.getKey()
                               .substring("BeersLiked/".length()));
            } else if (entry.getKey().startsWith("BarsFrequented/")) {
                int times = Integer.parseInt(entry.getValue());
                if (times > 0) {
                    barsFrequented.add(entry.getKey()
                                       .substring("BarsFrequented/".length()));
                    timesFrequented.add(Integer.parseInt(entry.getValue()));
                }
            }
        }
        boolean success = beerDB.updateDrinkerInfo
            (new BeerDB.DrinkerInfo(name, address,
                                    beersLiked, barsFrequented, timesFrequented));
        if (success) {
            return redirect(controllers.routes.Application
                            .viewDrinker(drinkerInfo.name));
        } else {
            return ok(error.render("No drinker named \"" + name + "\""));
        }
    }
    */

}
