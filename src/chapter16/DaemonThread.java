package chapter16;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName()+"---r---"+i);
        }
    }

    public static void main(String[] args) {
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true);
        System.out.println(dt.isDaemon());
        dt.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
/*
* setDaemon(true):可以将线程设置为后台线程，又称为守护线程
* 后台线程有个特征：如果所有前台线程死亡，后台线程为自动死亡
*isDaemon用来判断是否为后台线程
* */