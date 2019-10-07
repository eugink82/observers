package decorator;

public class Mocha extends CondimentDecorator {
    protected Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        double cost=beverage.cost();
        if(beverage.getSize()==Beverage.SMALL){
            cost+=0.15;
        }
        else if(beverage.getSize()==Beverage.MIDDLE){
            cost+=0.2;
        }
        else if(beverage.getSize()==Beverage.BIG){
            cost+=0.25;
        }
        return cost;
    }
}
