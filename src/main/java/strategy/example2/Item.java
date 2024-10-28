package strategy.example2;

/**
 * @author shguddnr2@coremethod.co.kr
 * @version 1.0
 * @since 24. 10. 28.
 */
public class Item {

    private String upCode;
    private int price;

    public Item(String upCode, int price) {
        this.upCode = upCode;
        this.price = price;
    }

    public String getUpCode() {
        return upCode;
    }

    public int getPrice() {
        return price;
    }

}
