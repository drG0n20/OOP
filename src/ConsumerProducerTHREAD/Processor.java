package ConsumerProducerTHREAD;

import java.util.Scanner;

public class Processor {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread is running!");
            wait();
            System.out.println("Producer resumed!");
        }

    }

    public void consume() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("Wait for ENTER!");
            sc.nextLine();
            System.out.println("ENTER pressed");
            notify();

        }
    }
}
