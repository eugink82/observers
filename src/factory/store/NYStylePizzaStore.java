package factory.store;

import factory.fabric.NYPizzaIngredientFactory;
import factory.fabric.PizzaIngredientFactory;
import factory.pizza.*;

public class NYStylePizzaStore  extends PizzaStore {

    public Pizza createPizza(String type){
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
        return StoreUtil.createPizzaWithIngredients(pizza,type,ingredientFactory);
    }
}
