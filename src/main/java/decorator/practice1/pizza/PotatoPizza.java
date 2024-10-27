package decorator.practice1.pizza;

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
public class PotatoPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Potato";
    }

    @Override
    public int getPrice() {
        return 8000;
    }

}
