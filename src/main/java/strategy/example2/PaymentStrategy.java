package strategy.example2;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @author shguddnr2@coremethod.co.kr
 * @version 1.0
 * @since 24. 10. 28.
 */
interface PaymentStrategy {
    void pay(int amount);
}

@Slf4j
@ToString
class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        log.info("this = {}", this);
        log.info("amount = {}", amount);
    }

}

@Slf4j
@ToString
class PayPalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PayPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        log.info("this = {}", this);
        log.info("amount = {}", amount);
    }

}
