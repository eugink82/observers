package factory.store;

import factory.fabric.SimplePizzaFactory;
import factory.pizza.*;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza=createPizza(type);
       if(pizza!=null) {
           pizza.prepare();
           pizza.bake();
           pizza.cut();
           pizza.box();
       }
       else {
           System.out.println("Данной пиццы нет в наличии");
       }
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
