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

        //Lists all heroes and objects properties
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            List<Hero> heroes = Hero.getAll();
            List<Squad> squads = Squad.getAll();
            model.put("heroes", heroes);
            model.put("squads", squads);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());


        //get: show new hero form,User requests for to create new objects,server returns page with form for create hero.
        get("/newHero", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());


        // process new heroes form,Server grabs attributes from form and rendors a success page
        post("/", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String specialPower = request.queryParams("specialPower");
            String weakness = request.queryParams("weakness");
            Hero newHero = new Hero(name,age,specialPower, weakness);
            model.put("newHero", newHero);
            return new ModelAndView(model, "hero-success.hbs");
        }, new HandlebarsTemplateEngine());

        //get to show squad form, User requests for squad form to create new objects, server returns page with add squad
        get("/newSquad", (req, res)->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        // process new squads form,Server grabs attributes from form and rendors a success page
        post("/", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            String squadName = request.queryParams("squadName");
            int maxSize = Integer.parseInt(request.queryParams("maxSize"));
            String squadCause = request.queryParams("squadCause");
            Squad newSquad = new Squad(squadName, squadCause);
            model.put("newSquad", newSquad);
            return new ModelAndView(model, "squad-success.hbs");
        }, new HandlebarsTemplateEngine());


    }
}
