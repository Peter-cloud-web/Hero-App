import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.ArrayList;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

//App.java is responsible for the front-end user interface of the application.

//ROUTING
public class App {
    public static void main(String[] args) { //type “psvm + tab” to autocreate this :)
        staticFileLocation("/public");

        post("/hero/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<String, Object>();//We create our HashMap named model.// we use our Hero constructor to create a new Hero with the user's provided content.
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            Hero newHero = new Hero(name,age, power, weakness);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        post("/squad/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<String, Object>();//We create our HashMap named model.// we use our Hero constructor to create a new Hero with the user's provided content.
          String name = request.queryParams("name");
          String cause = request.queryParams("cause");
          Squad newSquad = new Squad(name, cause);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Hero> heroes = Hero.getAllHeroes();
            int totalHeroes = Hero.getAllHeroes().size();
            int totalSquads = Squad.getAllSquad().size();
            model.put("totalHeroes",totalHeroes);
            model.put("totalSquads",totalSquads);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());
        get("/squad/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("allHeroes", Hero.getAllHeroes());
            model.put("allSquads", Squad.getAllSquad());
            return new ModelAndView(model, "heroes-squads.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad/:id", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfSquadToFind = Integer.parseInt(req.params("id"));
            Squad foundSquad = Squad.findById(idOfSquadToFind);
            model.put("squad",foundSquad);
            return new ModelAndView(model, "squad-details.hbs"); //individual post page.
        }, new HandlebarsTemplateEngine());


//        get("/hero/:id", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfHeroToFind = Integer.parseInt(req.params("id"));
            Hero foundHero = Hero.findById(idOfHeroToFind);
            model.put("hero",foundHero);
            return new ModelAndView(model, "hero-detail.hbs"); //individual post page.
        }, new HandlebarsTemplateEngine());

    }
    }

