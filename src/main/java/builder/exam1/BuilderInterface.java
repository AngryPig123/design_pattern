package builder.exam1;

public interface BuilderInterface {
    void buildBody();

    void insertWheels();

    void addHeadlights();

    Product getVehicle();
}

class Car implements BuilderInterface {
    private final Product product = new Product();

    @Override
    public void buildBody() {
        product.add("this is a body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("this is a wheel of a car");
    }

    @Override
    public void addHeadlights() {
        product.add("this is a head light of a car");
    }

    @Override
    public Product getVehicle() {
        return product;
    }

}


class MotorCycle implements BuilderInterface {
    private final Product product = new Product();

    @Override
    public void buildBody() {
        product.add("this is a head light of a motor cycle");
    }

    @Override
    public void insertWheels() {
        product.add("this is a head light of a motor cycle");
    }

    @Override
    public void addHeadlights() {
        product.add("this is a head light of a motor cycle");
    }

    @Override
    public Product getVehicle() {
        return product;
    }

}
