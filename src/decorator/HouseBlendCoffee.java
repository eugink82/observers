package decorator;

public class HouseBlendCoffee extends Beverage {

    public HouseBlendCoffee() {
        description="House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
