package tutorial.food.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Food {
    private String name;
    private BigDecimal price;
}
