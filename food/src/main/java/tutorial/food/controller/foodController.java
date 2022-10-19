package tutorial.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Annotation This is what spring boot scans
// find out what controllers and services are in a web application context
public class foodController {

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }
}
