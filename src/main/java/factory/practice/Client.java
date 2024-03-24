package factory.practice;

public class Client {

    public static void main(String[] args) {
        Animal tiger = new ConcreteFactory().createAnimal("tiger");
        tiger.sound();

        Animal duck = new ConcreteFactory().createAnimal("duck");
        duck.sound();
    }

}
