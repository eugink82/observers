package observer;

public class Main {
    public static void main(String[] args) {
        Murzilka murzilka=new Murzilka();
        murzilka.releaseNumber(1);
        murzilka.releaseNumber(2);
        Schoolchild schoolchild1=new Schoolchild("Петя Ершов");
        Schoolchild schoolchild2=new Schoolchild("Аня Малыгина");
        Schoolchild schoolchild3=new Schoolchild("Олег Бастомаров");
        Schoolchild schoolchild4=new Schoolchild("Сергей Крутов");

        schoolchild1.becomeObserver(murzilka);
      //  schoolchild2.becomeObserver(murzilka);
        schoolchild3.becomeObserver(murzilka);
        schoolchild4.becomeObserver(murzilka);

        murzilka.releaseNumber(3);
        schoolchild2.leaveObserver();
        System.out.println();
        murzilka.releaseNumber(4);

    }
}
