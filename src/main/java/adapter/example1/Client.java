package adapter.example1;

/**
 * @author shguddnr2@coremethod.co.kr
 * @version 1.0
 * @description
 * @since 24. 10. 31.
 */
public class Client {

    public static void main(String[] args) {

        Turkey turkey = new SeoulTurkey();
        turkey.gobble();
        turkey.fly();

        Duck turkeyDuck = new TurkeyAdapter(turkey);
        turkeyDuck.quack();
        turkeyDuck.fly();

    }

}
