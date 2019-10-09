package factory.pizza;

import factory.ingredients.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    List<String> topping=new ArrayList<>();

   public abstract void prepare();

//    public void prepare(){
//        System.out.println("Готовим пиццу "+name);
//        System.out.println("Подготавливаем основу...");
//        System.out.println("Добавляем соус...");
//        System.out.println("Добавляем набор добавок:");
//        for(int i=0;i<topping.size();i++){
//            System.out.println(" "+topping.get(i));
//        }
//    }
    public void bake(){
        System.out.println("Выпекаем 25 минут при температуре 350 ");
    }
    public void cut(){
        System.out.println("разрезаем пиццу на диагональные ломтики");
    }
    public void box(){
        System.out.println("Помещаем пиццу в официальную коробку PizzaStore");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
