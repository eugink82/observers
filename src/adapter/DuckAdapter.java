package adapter;

public class DuckAdapter  implements Turkey{
    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
        System.out.println(" with gobble");
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
