package builder.exam1;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        BuilderInterface carBuilder = new Car();
        director.construct(carBuilder);
        Product vehicle = carBuilder.getVehicle();
        vehicle.show();
    }

}
