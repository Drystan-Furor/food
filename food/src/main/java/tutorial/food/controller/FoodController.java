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
        int result = foodService.addFood(food);

        if (food.getPrice() > 100) { //error handling
            model.addAttribute(
                    "errorMessage",
                    String.format("Could not add %s, dude. It's too much clams" , food.getName()));
        } else if (result < 1) { //error handling
            model.addAttribute(
                    "errorMessage",
                    String.format("Could not add %s", food.getName()));
        } else {
            model.addAttribute("successMessage",
                    String.format("Successfully added %s", food.getName()));
        }

        // this adds the array to the template.
        Food[] foods = foodService.getFoods();
        model.addAttribute("foods", foods);
        return "home";
    }

    @GetMapping("/home")
    // Food.food required because it's the GetMapping, but not used in this method
    public String getHome(Model model, Food food) {
        model.addAttribute("message", "Hello VIEW, this is Controller.");

        // this adds the array to the template.
        Food[] foods = foodService.getFoods();
        model.addAttribute("foods", foods);

        return "home";
    }
}
