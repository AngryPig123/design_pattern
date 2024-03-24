package abstractfactory.exam1;

interface Figure {
    void create();
}

interface FigureFactory {
    Figure createFigure(Shape shape, Color color);
}

class MyFigure implements Figure {
    private Shape shape;
    private Color color;

    public MyFigure(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public void create() {
        shape.draw();
        color.fill();
    }

}

class MyFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure(Shape shape, Color color) {
        return new MyFigure(shape, color);
    }
}

