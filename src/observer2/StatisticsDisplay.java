package observer2;

public class StatisticsDisplay extends DeviceDisplay implements Observer,Display {
    private static int count;

    public StatisticsDisplay(WheatherData wheatherData) {
        wheatherData.registerObserver(this);
    }
    @Override
    public void update(int temperature, int humidity, int pressure) {
        count++;
        this.temperature +=temperature;
        this.humidity +=humidity;
        this.pressure +=pressure;
        //display();
    }

//    public void removeSubject() {
//        if (wheatherData != null) {
//            wheatherData.removeObserver(this);
//        }
//    }

    @Override
    public void display() {
        System.out.println("Получены следующие среднестатистические показатели за "+count+" дней: температура- "+temperature/count+
                ", влажность- "+humidity/count+", давление- "+pressure/count);
    }
}
