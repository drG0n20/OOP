package THREADS_ex;


import java.util.Scanner;

public class Processor {

    public void cook() throws InterruptedException {
        synchronized (this) {
            for (int i = 1; i < 6; i++) {
                System.out.printf("Nakladam klientowi %d porcje pierogow\n", i);
                Thread.sleep(300);
            }
            wait();
            System.out.println("Panie! \nWszystko zes mi pan zezarl! \nMusze teraz zamknac interes!");
        }
    }

    public void customer() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("\nKlient:\n");
            for (int i = 0; i < 5; i++) {
                System.out.print("Omnom");
                Thread.sleep(300);
            }
            System.out.print("\n[nacisnij ENTER]");
            scanner.nextLine();
            System.out.println("Juz nie moge tych pierogow, dajcie wiadro!\n");
            notify();
            Thread.sleep(2000);
        }
    }
}
