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
        return ok(index.render(courseDB.getAllCourseNames()));
    }

    /*
    public Result viewDrinker(String name) throws SQLException {
        BeerDB.DrinkerInfo drinkerInfo = beerDB.getDrinkerInfo(name);
        if (drinkerInfo == null) {
            return ok(error.render("No drinker named \"" + name + "\""));
        } else{
            return ok(drinker.render(drinkerInfo));
        }
    }

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