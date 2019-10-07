package observer;

public interface Press {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
