package iteratorAndComposite;

import java.util.List;

public class MeatMain {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinnerMenu = new DinnerMenu();
        Menu cafeMenu=new CafeMenu();
        Waitress waitress=new Waitress(pancakeHouseMenu,dinnerMenu,cafeMenu);
        waitress.printMenu();

//        Iterator pancakeIterator=pancakeHouseMenu.createIterator();
//        Iterator dinnerIterator=dinnerMenu.createIterator();
//        printListMenu(pancakeIterator);
//        printListMenu(dinnerIterator);
    }

//    private static void printListMenu(Iterator iterator) {
//
//       while(iterator.hasNext()) {
//           MenuItem item=(MenuItem)iterator.next();
//           System.out.println(item.getName());
//           System.out.println(item.getDescription());
//           System.out.println(item.getPrice());
//           System.out.println(item.isVegetarian());
//       }
//    }
}
