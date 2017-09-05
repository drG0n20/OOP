package simple_ArrayQueue;

import java.util.ArrayDeque;

public class SimulateQueue {
    public static void main(String[] args) {
        ArrayDeque<Person> queue = new ArrayDeque<>(5);
        queue.add(new Person("\nMariola ", "piwo, wino, cola"));
        queue.add(new Person("\nAndzej z wasem ", "paczka szlugow"));
        queue.add(new Person("\nKuba ", "materac"));
        queue.add(new Person("\nMariola ", "godnosc osobista"));

        //Zaczynamy obsluge
        while (!queue.isEmpty()) {
            Person currentClient = queue.removeFirst();
            System.out.print(currentClient.getName());
            System.out.println(currentClient.unpackShopping());
        }
        System.out.println("Obsluzylismy klientow");
    }
}
