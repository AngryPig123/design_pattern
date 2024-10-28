package strategy.example1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author shguddnr2@coremethod.co.kr
 * @version 1.0
 * @since 24. 10. 28.
 */
@Slf4j
public class Client {

    private static final HangleStringReturner hangleReturner = new HangleStringReturner();
    private static final AlphabetStringReturner stringReturner = new AlphabetStringReturner();
    private static final NumberStringReturner numberReturner = new NumberStringReturner();

    public static void main(String[] args) {

        StringStrategy init = StringStrategy.init(hangleReturner);
        log.info("init = {}", init.execute());

        init.setStringReturner(stringReturner);
        log.info("init = {}", init.execute());

        init.setStringReturner(numberReturner);
        log.info("init = {}", init.execute());

    }

}
