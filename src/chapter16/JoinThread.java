package chapter16;


//join线程
public class JoinThread extends Thread {
    public JoinThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+" -- "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new JoinThread("新线程").start();
        for (int i = 0; i < 100; i++) {
            if (i==20) {
                JoinThread joinThread = new JoinThread("被Join的线程");
                joinThread.start();
                //main线程调用了joinThread的join方法，main线程必须要等joinThread执行完了，才能执行
                joinThread.join();
            }
            System.out.println(Thread.currentThread().getName()+"       "+i);
        }
    }
}
/*
* 先启动主线程和新线程，当i=20是，启动Join线程，主线程阻塞，等Join线程执行完毕，主线程才执行
*
* */