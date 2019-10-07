package decorator;

public class Soy extends CondimentDecorator {
    protected Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost=beverage.cost();
        if(beverage.getSize()==Beverage.SMALL){
          cost+=0.1;
        }
        else if(beverage.getSize()==Beverage.MIDDLE){
          cost+=0.15;
        }
        else if(beverage.getSize()==Beverage.BIG){
          cost+=0.2;
        }
        return cost;
    }
}
