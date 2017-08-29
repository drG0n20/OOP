package OBSERWATOR_Ambulans;

public interface IOperator {
    void registerObserver();

    void removeObserver();

    void notifyObserver();
}
