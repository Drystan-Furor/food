package tutorial.food.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tutorial.food.model.Food;

@Mapper
public interface FoodMapper {

    @Select("SELECT * FROM FOODLIST")
    Food[] selectFoods();


}
