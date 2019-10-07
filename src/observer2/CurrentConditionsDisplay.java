package observer2;

public class CurrentConditionsDisplay extends DeviceDisplay implements Observer,Display{


    public CurrentConditionsDisplay(WheatherData wheatherData) {
        //super(wheatherData);
        wheatherData.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure =pressure;
        display();
    }

//    public void removeSubject() {
//        if (wheatherData != null) {
//            wheatherData.removeObserver(this);
//        }
//    }

    public void display() {
        System.out.println("Текущая температура: " + temperature + ", влажность: " + humidity + ", давление: " + pressure);
    }
}
