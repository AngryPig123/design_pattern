package factory.exam1;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }

    // other helper methods

}

class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Circle factoryMethod() {
        return new Circle();
    }
}

class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Square factoryMethod() {
        return new Square();
    }
}
