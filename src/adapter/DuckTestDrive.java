package adapter;

import java.util.Iterator;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck();
        WildTurkey wildTurkey=new WildTurkey();
        Duck turkeyAdapter=new TurkeyAdapter(wildTurkey);
        Turkey duckAdapter=new DuckAdapter(mallardDuck);
        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("The Duck says...");
        testDuck(mallardDuck);
        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
        System.out.println("----");
        System.out.println("The DuckAdapter says...");
        testTurkey(duckAdapter);

    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

    public static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
