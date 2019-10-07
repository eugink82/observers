package observer;

public class Schoolchild implements Observer{
    private String name;
    private Press press;

    public Schoolchild(String name) {
        this.name = name;
    }

    @Override
    public void becomeObserver(Press press) {
        this.press=press;
        press.addObserver(this);
    }

    @Override
    public void leaveObserver() {
       if(press!=null) {
           press.removeObserver(this);
       } else {
           System.out.println(name+" вы не подписаны на удаляемый журнал");
       }
    }

    @Override
    public void handleEvent(int number) {
        System.out.println("Уважаемый "+name+" вышел новый "+number+" номер твоего любимого журнала Мурзилка");
    }
}
