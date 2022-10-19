package tutorial.food.service;

import org.springframework.stereotype.Service;
import tutorial.food.model.Food;

@Service
public class FoodService {

    public Food[] getFoods(){
        double price;
        String name;
        Food[] foods = {new Food(name="Burrito", price=3.25),
                new Food(name="Kapsalon", price=9.50),
                new Food(name="Water", price=2.00)};

        return foods;
    }
}
