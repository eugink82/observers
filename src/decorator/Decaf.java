package decorator;

public class Decaf extends Beverage {

    public Decaf() {
        description="Decaf";
    }

    @Override
    public Float cost() {
        return 8.3f;
    }
}
