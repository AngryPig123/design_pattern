package strategy.example1;

/**
 * @author shguddnr2@coremethod.co.kr
 * @version 1.0
 * @since 24. 10. 28.
 */
public class HangleStringReturner extends StringReturner {
    @Override
    protected String callString() {
        return "가나다라마바사";
    }
}
