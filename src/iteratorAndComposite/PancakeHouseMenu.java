package iteratorAndComposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{
    private List<MenuItem> menuItems=new ArrayList<>();

    public PancakeHouseMenu() {
    }

    @Override
    public void listMenu() {
        addItems("K&B Pancake Breakfast","Pancakes with scrambled eggs, and toast",true,2.99);
        addItems("Regular Pancake Breakfast","Pancakes with fried eggs, sauce",false,2.99);
        addItems("Blueberry Pancake","Pancakes made with fresh blueberries",true,3.49);
        addItems("Waffles","Waffles, with you choice of blueberries or strawberries",true,3.59);

    }

    public void addItems(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }

    @Override
    public String getName() {
        return "Breakfast menu";
    }
}
