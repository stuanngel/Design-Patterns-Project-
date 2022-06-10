package SantaClausFactory;


public interface Observable {
    void hireDwarf(Observer observer);
    void removeDwarf(Observer observer);

    void notifyObservers();
    String getUpdate();
}
