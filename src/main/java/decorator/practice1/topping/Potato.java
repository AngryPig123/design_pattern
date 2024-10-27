package decorator.practice1.topping;

import decorator.practice1.pizza.Pizza;

/**
 * packageName    : decorator.practice1
 * fileName       : Potato
 * author         : AngryPig123
 * date           : 24. 10. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 27.        AngryPig123       최초 생성
 */
public class Potato extends PizzaDecorator {

    public Potato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return String.format("%s, Potato", pizza.getDescription());
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 300;
    }

}
