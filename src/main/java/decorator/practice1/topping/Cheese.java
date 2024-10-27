package decorator.practice1.topping;

import decorator.practice1.pizza.Pizza;

/**
 * packageName    : decorator.practice1
 * fileName       : Cheese
 * author         : AngryPig123
 * date           : 24. 10. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 27.        AngryPig123       최초 생성
 */
public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return String.format("%s, Cheese", pizza.getDescription());
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 500;
    }

}
