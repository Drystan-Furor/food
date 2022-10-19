package tutorial.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Annotation This is what spring boot scans
// find out what controllers and services are in a web application context
public class FoodController {

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("message", "Hello VIEW, this is Food Controller speaking.");
        return "home";
    }
}
