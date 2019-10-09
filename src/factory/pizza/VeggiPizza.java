package factory.pizza;

import factory.fabric.PizzaIngredientFactory;

public class VeggiPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+name);
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
        veggies=ingredientFactory.createVeggies();
    }
}
