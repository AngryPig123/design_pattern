package factory.practice;

public abstract class AnimalFactory {

    public abstract Animal createAnimal(String type);

}

class ConcreteFactory extends AnimalFactory {
    @Override
    public Animal createAnimal(String type) {
        if ("tiger".equalsIgnoreCase(type)) {
            return new Tiger();
        }
        if ("duck".equalsIgnoreCase(type)) {
            return new Duck();
        }
        throw new RuntimeException();
    }
}
