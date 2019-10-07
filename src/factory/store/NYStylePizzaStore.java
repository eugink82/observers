package factory.store;

import factory.pizza.*;

public class NYStylePizzaStore  extends PizzaStore {

    public Pizza createPizza(String type){
        Pizza pizza=null;
        switch (type) {
            case "cheese":
                pizza = new NyStyleCheesePizza();
                break;
            case "clam":
                pizza = new NyStyleClamPizza();
                break;
            case "veggie":
                pizza = new NyStyleVeggiePizza();
                break;
            case "pepperoni":
                pizza = new NyStylePepperoniPizza();
                break;
        }
        return pizza;
    }
}
