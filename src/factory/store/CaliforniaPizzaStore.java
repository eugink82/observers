package factory.store;

import factory.pizza.*;

public class CaliforniaPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        Pizza pizza=null;
        switch (type) {
            case "cheese":
                pizza = new CaliforniaStyleCheesePizza();
                break;
            case "clam":
                pizza = new CaliforniaStyleClamPizza();
                break;
            case "veggie":
                pizza = new CaliforniaStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new CaliforniaStylePepperoniPizza();
                break;
        }
        return pizza;
    }

}
