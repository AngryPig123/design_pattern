package abstractfactory.exam1;

interface Color {
    void fill();
}

class Red implements Color {
    @Override
    public void fill() {
        System.out.println(this.getClass());
    }
}

class Green implements Color {
    @Override
    public void fill() {
        System.out.println(this.getClass());
    }
}

class Blue implements Color {
    @Override
    public void fill() {
        System.out.println(this.getClass());
    }
}
