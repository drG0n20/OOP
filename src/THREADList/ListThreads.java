package THREADList;

import java.util.ArrayList;
import java.util.Random;

public class ListThreads implements Runnable {
    private Object stageOneLocker = new Object();
    private Object stageTwoLocker = new Object();
    private int _counter;
    private ArrayList<Integer> _stageOne = new ArrayList<>();
    private ArrayList<Integer> _stageTwo = new ArrayList<>();
    private Random rand = new Random();

    public void stageOne() throws InterruptedException {
        synchronized (stageOneLocker) {
            Thread.sleep(1);
            _stageOne.add(rand.nextInt());
            _counter++;
        }
    }

    public void stageTwo() throws InterruptedException {
        synchronized (stageTwoLocker) {
            Thread.sleep(1);
            _stageTwo.add(rand.nextInt());
            _counter++;
        }
    }

    public void process() throws InterruptedException {
//        for (int i = 0; i < 1000; i++) {
        while (_counter < 1000) {
            stageOne();
            stageTwo();
        }
    }

    @Override
    public void run() {
        try {
            process();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
