package decorator.practice1.topping;

import decorator.practice1.pizza.Pizza;

/**
 * packageName    : decorator.practice1
 * fileName       : ToppingDecorator
 * author         : AngryPig123
 * date           : 24. 10. 27.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 27.        AngryPig123       최초 생성
 */
public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public abstract String getDescription();

}
