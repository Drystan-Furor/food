package tutorial.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import tutorial.food.model.Food;
import tutorial.food.service.FoodService;

@Controller //Annotation This is what spring boot scans
// find out what controllers and services are in a web application context
public class FoodController {

    private FoodService foodService;
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping("/home")
    public String addFood(Model model, Food food) { //get the model from the template
        if (foodService.addFood(food) < 1) { //error handling
            model.addAttribute(
                    "errorMessag",
                    String.format("Could not add %s", food.getName()));
        }
        model.addAttribute("succesMessage",
                String.format("Succesfully added %s", food.getName()));
        return "home";
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("message", "Hello VIEW, this is Food Controller speaking.");

        double price;
        String name;
        Food[] foods = foodService.getFoods();

        // this adds the array to the template.
        model.addAttribute("foods", foods);

        return "home";
    }
}
