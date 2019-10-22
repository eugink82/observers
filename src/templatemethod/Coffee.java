package templatemethod;

public class Coffee extends Drink {

    public void brewDrink(){
        System.out.println("Налить кофе через фильтр");
    }

    public  void addIngredient(){
        System.out.println("Добавить сахар и молоко");
    }

}
