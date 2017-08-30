package OBSERWATOR_Ambulans;

public class FirstAmbulance implements IAmbulance {
    private IOperator operator;

    public FirstAmbulance(IOperator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
        driveToIncident();
    }

    public void driveToIncident() {
        System.out.println(FirstAmbulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident: " + operator.getStatus());
    }
}
