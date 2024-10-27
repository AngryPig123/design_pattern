package decorator.practice1.topping;

import decorator.practice1.pizza.Pizza;

/**
 * packageName    : decorator.practice1
 * fileName       : Pepperoni
 * author         : AngryPig123
 * date           : 24. 10. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 27.        AngryPig123       최초 생성
 */
public class Pepperoni extends PizzaDecorator {

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return String.format("%s, Pepperoni", pizza.getDescription());
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1000;
    }

}
