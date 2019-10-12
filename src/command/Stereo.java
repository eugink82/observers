package command;

public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("Стереосистема "+name+" включена");
    }

    public void off(){
        System.out.println("Стереосистема "+name+" выключена");
    }

    public void setCD(){
        System.out.println("Установлен CD");
    }

    public void setDVD(){
        System.out.println("Установлен DVD");
    }

    public void setRadio(){
        System.out.println("Включено радио");
    }

    public void setVolume(String volume){
        System.out.println("Установлена громкость на "+volume);
    }
}
