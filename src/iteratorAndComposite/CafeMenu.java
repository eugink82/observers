package iteratorAndComposite;

import iteratorAndComposite.composite.MenuItem;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {
    HashMap<String, MenuItem> menuItems=new HashMap();

    public CafeMenu() {
    }

    public void addItems(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItem);
    }

    @Override
    public String getName() {
        return "Cafe Menu";
    }

    @Override
    public void listMenu() {
        addItems("Veggie Burger and Air Fries","Veggie Burger on a whole wheat bun, lettuce, tomato and fries",
                true,3.99);
        addItems("Soup of the day","A cup of the soup of the day, with a side salad",
                false,3.69);
        addItems("Burrito","A large burrito, with whole pinto beans, salsa, guacamole",
                true,4.29);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
