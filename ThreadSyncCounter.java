class Counter {
    int value;

    // we don't get 2000 if we don't use synchronized because both threads will be increamenting at the same time which causes the problem
    public synchronized void increment() {
        value++;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread is fired ");

        Counter c = new Counter();


        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for ( int i = 1; i<1001; i++ ) {
                    c.increment();
                }
            }
        });



        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for ( int i = 1; i<1001; i++ ) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("barrier");



        System.out.println("Value of c is: " + c.value);

    }
}
