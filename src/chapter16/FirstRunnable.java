package chapter16;

public class FirstRunnable implements Runnable {
    private int i;
    @Override
    public void run() {
        for (; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        FirstRunnable runnable = new FirstRunnable();
        Thread t1 = new Thread(runnable,"t1");
        Thread t2 = new Thread(runnable,"t2");
        t1.start();
        t2.start();
    }
}
