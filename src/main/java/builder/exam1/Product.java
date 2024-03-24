package builder.exam1;

import java.util.LinkedList;

public class Product {

    private final LinkedList<String> parts = new LinkedList<>();

    public Product add(String message) {
        System.out.println(message);
        parts.add(message);
        return this;
    }

    public void show() {
        System.out.println(parts);
    }

}
