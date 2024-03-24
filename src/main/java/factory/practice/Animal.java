package factory.practice;

public interface Animal {
    void sound();
}

class Tiger implements Animal {
    @Override
    public void sound() {
        System.out.println(this.getClass());
    }
}

class Duck implements Animal {
    @Override
    public void sound() {
        System.out.println(this.getClass());
    }
}
