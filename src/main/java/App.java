import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;
import static spark.debug.DebugScreen.enableDebugScreen;

public class App {
    public static void main(String[] args){
        enableDebugScreen();

        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //get: show new hero form
        get("/newHero", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());


        // process new heroes form
        post("/newHero", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            String heroName = request.queryParams("heroName");
            //int age = Integer.parseInt(request.queryParams("age"));
            String specialPower = request.queryParams("specialPower");
            String weakness = request.queryParams("weakness");
            Hero newHero = new Hero(heroName, specialPower, weakness);
            model.put("newHero", newHero);
            return new ModelAndView(model, "hero-success.hbs");
        }, new HandlebarsTemplateEngine());

        // shows all Heroes and Squads Created
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            List<Hero> heroes = Hero.all();
            List<Squad> squads = Squad.all();
            model.put("heroes", heroes);
            model.put("squads", squads);
            return new ModelAndView(model, "/");
        }, new HandlebarsTemplateEngine());


    }
}
