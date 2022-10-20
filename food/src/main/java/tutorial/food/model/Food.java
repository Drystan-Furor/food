package tutorial.food.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class Food {
    private Integer id;
    private String name;
    private Double price;
}
