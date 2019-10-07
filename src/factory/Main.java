package factory;

import factory.fabric.SimplePizzaFactory;
import factory.pizza.NyStyleCheesePizza;
import factory.pizza.Pizza;
import factory.store.ChicagoStylePizzaStore;
import factory.store.NYStylePizzaStore;
import factory.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore=new NYStylePizzaStore();
        PizzaStore chicagoPizzaStore=new ChicagoStylePizzaStore();
        Pizza pizza=nyPizzaStore.orderPizza("cheese");
        System.out.println("Сара заказала "+pizza.getName()+" пиццу");
        pizza=chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Майкл заказал "+pizza.getName()+" пиццу");
    }
}
