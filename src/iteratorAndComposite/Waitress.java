package iteratorAndComposite;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Waitress {
    private List<Menu> menus;

    public Waitress(Menu... menus) {
        this.menus= Arrays.asList(menus);
    }

    public void printMenu(){
        Iterator menuIterator=menus.iterator();
        while(menuIterator.hasNext()){
            Menu menu=(Menu)menuIterator.next();
            System.out.println("----"+menu.getName()+"----");
            menu.listMenu();
            printMenu(menu.createIterator());
        }
//        for(Menu m: menus){
//            m.listMenu();
//            Iterator iterator=m.createIterator();
//            System.out.println("----"+m.getName()+"----");
//            printMenu(iterator);
//        }
    }

    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item=(MenuItem)iterator.next();
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
        }
    }

}
