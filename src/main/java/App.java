import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;
import static spark.debug.DebugScreen.enableDebugScreen;

public class App {
    public static void main(String[] args){
        enableDebugScreen();

        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        // shows all Heroes and Squads Created
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
           // ArrayList<Hero> Heroes = Hero.();
            List<Squad> Squads = Squad.all();
           // model.put("Heroes", Heroes);
            model.put("Squads", Squads);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
