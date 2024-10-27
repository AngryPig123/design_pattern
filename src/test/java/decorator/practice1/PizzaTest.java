package decorator.practice1;

import decorator.practice1.pizza.Pizza;
import decorator.practice1.pizza.PotatoPizza;
import decorator.practice1.topping.Cheese;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * packageName    : decorator.practice1
 * fileName       : PizzaTest
 * author         : AngryPig123
 * date           : 24. 10. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 27.        AngryPig123       최초 생성
 */
@Slf4j
class PizzaTest {

    @Test
    void pizza() {
        Pizza pizza = new PotatoPizza();
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        log.info("price = {}", pizza.getPrice());
        log.info("description = {}", pizza.getDescription());
    }

}