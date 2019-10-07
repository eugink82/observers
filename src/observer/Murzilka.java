package observer;

import java.util.ArrayList;
import java.util.List;

public class Murzilka  implements Press{
    private int number;
    private List<Observer> observers=new ArrayList<>();

    public void releaseNumber(int number){
        this.number=number;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index=observers.indexOf(o);
        if(index>=0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers){
            o.handleEvent(number);
        }
    }
}
