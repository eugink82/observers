package factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> topping=new ArrayList<>();

    public void prepare(){
        System.out.println("Готовим пиццу "+name);
        System.out.println("Подготавливаем основу...");
        System.out.println("Добавляем соус...");
        System.out.println("Добавляем набор добавок:");
        for(int i=0;i<topping.size();i++){
            System.out.println(" "+topping.get(i));
        }
    }
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
}
