package SecondTHREAD;

public class Runner {
    public static void main(String[] args) {
        Runnable[] runners = new Runnable[10];
        Thread[] threads = new Thread[10];

        runners[0] = new MyRun("Marcin");
        runners[1] = new MyRun("Janusz");
        runners[2] = new MyRun("Daniel");
        runners[3] = new MyRun("Pawel");
        runners[4] = new MyRun("Piotrek");
        runners[5] = new MyRun("Hubert");
        runners[6] = new MyRun("Ania");
        runners[7] = new MyRun("Weronika");
        runners[8] = new MyRun("Kacper");
        runners[9] = new MyRun("Bolek");


        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runners[i]);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}


