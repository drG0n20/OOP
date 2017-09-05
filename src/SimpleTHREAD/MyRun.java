package SimpleTHREAD;

public class MyRun implements Runnable {
    private int _id;

    public MyRun(int id) {
        _id = id;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.printf("Hello form thread %d\n", _id);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
