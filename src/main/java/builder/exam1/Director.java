package builder.exam1;

public class Director {
    BuilderInterface builderInterface;

    public void construct(BuilderInterface myBuilder) {
        builderInterface = myBuilder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }

}
