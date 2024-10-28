package strategy.example1;

/**
 * @author shguddnr2@coremethod.co.kr
 * @version 1.0
 * @since 24. 10. 28.
 */
public class StringStrategy {

    private StringReturner stringReturner;

    private StringStrategy(StringReturner stringReturner) {
        this.stringReturner = stringReturner;
    }

    public static StringStrategy init(StringReturner stringReturner) {
        return new StringStrategy(stringReturner);
    }

    public void setStringReturner(StringReturner stringReturner) {
        this.stringReturner = stringReturner;
    }

    public String execute() {
        return stringReturner.callString();
    }

}
