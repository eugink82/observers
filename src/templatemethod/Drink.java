package templatemethod;

public abstract class Drink {
    protected final void prepareRecipe(){
        boilWater();
        brewDrink();
        pourInCup();
        addIngredient();
    }

    private void boilWater(){
        System.out.println("Вскипятить воду");
    }

    private void pourInCup(){
        System.out.println("Налить в чашку");
    }


    public abstract void brewDrink();
    public abstract void addIngredient();
}
