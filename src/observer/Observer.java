package observer;

public interface Observer {
    void handleEvent(int number);
    void becomeObserver(Press press);
    void leaveObserver();
}
