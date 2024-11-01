package adapter.example1;

/**
 * @author shguddnr2@coremethod.co.kr
 * @version 1.0
 * @description
 * @since 24. 10. 31.
 */
public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
    
}
