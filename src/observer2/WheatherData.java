package observer2;

import java.util.ArrayList;
import java.util.List;

public class WheatherData implements Subject {
    private int temperature;
    private int humidity;
    private int pressure;
    private List<Observer> observers=new ArrayList<>();

    public void setMeasurement(int temperature,int humidity, int pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index=observers.indexOf(o);
        if(index>=0){
            observers.remove(o);
        }

    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers){
            o.update(temperature,humidity,pressure);
        }
    }
}
