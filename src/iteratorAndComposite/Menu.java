package iteratorAndComposite;

import java.util.Iterator;

public interface Menu {
    String getName();
    void listMenu();
   // void addItems(String name,String description, boolean vegetarian,double price);
    Iterator createIterator();
}
