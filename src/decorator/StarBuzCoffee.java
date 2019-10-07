package decorator;

public class StarBuzCoffee {
    public static void main(String[] args) {
        Beverage espresso=new Espresso();
        System.out.println(espresso.getDescription()+" $"+espresso.cost());
        Beverage darkRoast=new DarkRoast();
        darkRoast.setSize(Beverage.SMALL);
        Beverage mocha=new Mocha(darkRoast);
        mocha.setSize(Beverage.SMALL);
        Beverage soya=new Soy(mocha);
        System.out.println(soya.getDescription()+" $"+soya.cost());
//        Beverage mocha=new Mocha(darkRoast);
//        Beverage mocha2=new Mocha(mocha);
//        Beverage whip=new Whip(mocha2);
//        System.out.println(whip.getDescription()+" $"+whip.cost());
    }
}
