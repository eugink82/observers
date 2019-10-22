package iteratorAndComposite;


import iteratorAndComposite.composite.MenuItem;

import java.util.Iterator;

public class DinnerMenu implements Menu {
    private static final int MAX_ITEMS=6;
    private MenuItem[] menuItems=new MenuItem[MAX_ITEMS];
    private int i;

    public void listMenu(){
        addItems("Vegetarian BLT","Bacon with letuce and tomato on whole wheat",true,2.99);
        addItems("BLT","Bacon with letuce and tomato on whole wheat",false,2.99);
        addItems("Soup of the day","Soup of the day, with a side of potato salade",false,3.29);
        addItems("Hotdog","a hot dog, with saurkraut, relish, onions, topped with cheese",false,3.05);
    }

    private void addItems(String name,String description, boolean vegetarian,double price){
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        if(i>=MAX_ITEMS){
            System.err.print("Sorry!Menu is full!Can`t do add item to menu");
        }
        menuItems[i++]=menuItem;
    }

    public Iterator createIterator(){
        return new AlternatingDinnerMenuIterator(menuItems);
    }

    @Override
    public String getName() {
        return "Dinner Menu";
    }
}
