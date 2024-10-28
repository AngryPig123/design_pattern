package strategy.example2;

/**
 * @author shguddnr2@coremethod.co.kr
 * @version 1.0
 * @since 24. 10. 28.
 */
public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1", 1000));
        cart.addItem(new Item("2", 2000));
        cart.pay(new PayPalStrategy("shguddnr2@Naver.com", "1q2w3e4r!"));
    }

}
