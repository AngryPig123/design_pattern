package strategy.example1;

/**
 * @author shguddnr2@coremethod.co.kr
 * @version 1.0
 * @since 24. 10. 28.
 */
public class AlphabetStringReturner extends StringReturner {
    @Override
    protected String callString() {
        return "abcdefg";
    }
}
