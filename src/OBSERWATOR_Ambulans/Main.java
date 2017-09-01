package OBSERWATOR_Ambulans;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OperatorAdam operatorAdam = new OperatorAdam();
        FirstAmbulance firstAmbulance = new FirstAmbulance(operatorAdam);
        SecondAmbulance secondAmbulance = new SecondAmbulance(operatorAdam);
        ThirdAmbulance thirdAmbulance = new ThirdAmbulance(operatorAdam);

        operatorAdam.setStatus("Car accident");
        Thread.sleep(3000);
        operatorAdam.setStatus("Faint");
        Thread.sleep(3000);
        operatorAdam.setStatus("Broken bone");
    }
}
