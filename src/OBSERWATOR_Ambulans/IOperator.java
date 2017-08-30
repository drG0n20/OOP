package OBSERWATOR_Ambulans;

public interface IOperator {
    void registerObserver(IAmbulance ambulance);

    void removeObserver(IAmbulance ambulance);

    void notifyObservers();

    String getStatus();
}
