package idv.blake;

public interface Subject {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver();
}
