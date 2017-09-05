package SecondTHREAD;

public class MyRun implements Runnable {
    private String _name;

    public MyRun(String name) {
        _name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hello from thread %s\n", _name);
            System.out.printf("GoodBye from thread %s\n", _name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
