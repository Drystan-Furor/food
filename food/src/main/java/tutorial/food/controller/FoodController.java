package tutorial.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tutorial.food.model.Food;

@Controller //Annotation This is what spring boot scans
// find out what controllers and services are in a web application context
public class FoodController {

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("message", "Hello VIEW, this is Food Controller speaking.");

        double price;
        String name;
        Food[] foods = {new Food(name="Burrito", price=3.25),
                        new Food(name="Kapsalon", price=9.50),
                        new Food(name="Water", price=2.00)};

        // this adds the array to the template.
        model.addAttribute("foods", foods);

        return "home";
    }
}
