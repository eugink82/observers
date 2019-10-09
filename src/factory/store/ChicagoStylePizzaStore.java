package factory.store;

import factory.fabric.ChicagoPizzaIngredientFactory;
import factory.fabric.PizzaIngredientFactory;
import factory.pizza.*;

public class ChicagoStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new ChicagoPizzaIngredientFactory();
        return StoreUtil.createPizzaWithIngredients(pizza,type,ingredientFactory);
    }
}
