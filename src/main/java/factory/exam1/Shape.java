package factory.exam1;

public interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println(this.getClass());
    }

}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass());
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass());
    }
}

