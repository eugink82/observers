package command;

public class TV {
    private int channel=5;
    private String name;

    public TV(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("Включить телевизор");
    }

    public void off(){
        System.out.println("Выключить телевизор");
    }

    public void setVolume(){
        System.out.println("Установить громкость");
    }

    public void setInputChannel(){
        System.out.println("Нажать на "+channel+" канал");
    }
}
