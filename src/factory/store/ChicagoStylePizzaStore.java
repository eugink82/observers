package factory.store;

import factory.pizza.*;

public class ChicagoStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        Pizza pizza=null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "clam":
                pizza = new ChicagoStyleClamPizza();
                break;
            case "veggie":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new ChicagoStylePepperoniPizza();
                break;
        }
        return pizza;
    }
}
