package observer2;

public class Start {
    public static void main(String[] args) {
        WheatherData wheatherData=new WheatherData();
        wheatherData.setMeasurement(25,80,745);
        CurrentConditionsDisplay observer1=new CurrentConditionsDisplay(wheatherData);
        StatisticsDisplay observer2=new StatisticsDisplay(wheatherData);
        wheatherData.setMeasurement(35,40,768);
        wheatherData.setMeasurement(24,63,720);
        wheatherData.setMeasurement(31,78,731);
        wheatherData.setMeasurement(27,32,715);
        System.out.println("-----");
        observer2.display();
    }
}
