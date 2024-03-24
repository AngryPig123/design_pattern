package abstractfactory.exam1;

public class Client {
    public static void main(String[] args) {
        FigureFactory factory = new MyFigureFactory();
        Shape shape = new Rectangle();
        Color color = new Red();
        Figure figure = factory.createFigure(shape, color);
        figure.create();
    }
}
