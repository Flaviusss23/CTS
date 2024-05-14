public interface Subject {
    void registerObserver(Observer observer);
    void removObserver(Observer observer);
    void notifyObservers();
}
