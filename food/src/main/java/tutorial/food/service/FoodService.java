package tutorial.food.service;

import org.springframework.stereotype.Service;
import tutorial.food.mapper.FoodMapper;
import tutorial.food.model.Food;

@Service
public class FoodService {

    private FoodMapper foodMapper;

    public FoodService(FoodMapper foodMapper) {
        this.foodMapper = foodMapper;
    }


    public Food[] getFoods(){

        Food[] foods = foodMapper.selectFoods();

        return foods;
    }
}
