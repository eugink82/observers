package command;

public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("Свет в "+name+" включен!");
    }

    public void off(){
        System.out.println("Свет в "+name+" выключен!");
    }
}
