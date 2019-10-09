package factory.store;

import factory.fabric.PizzaIngredientFactory;
import factory.pizza.*;

public class StoreUtil {
    public static Pizza createPizzaWithIngredients(Pizza pizza, String type, PizzaIngredientFactory ingredientFactory){
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiPizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");;
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }
}
