package chapter16;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"---r---"+i);
        }
    }

    public static void main(String[] args) {
        DaemonThread dt = new DaemonThread();
//        dt.setDaemon(true);
        System.out.println(dt.isDaemon());
        dt.start();
        dt.setDaemon(true);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
/*
* setDaemon(true):可以将线程设置为后台线程，又称为守护线程
* 后台线程有个特征：如果所有前台线程死亡，后台线程为自动死亡
*isDaemon用来判断是否为后台线程
*
*主线程默认是前台线程，dt也默认是前台线程，有些线程默认是后台线程，
* 前台线程的子线程默认是后台线程
*
* 前台线程死亡后，JVM会通知后台线程死亡，但从接受命令，到做出响应，
* 需要一定时间，要将某个线程指定为后台线程，必须在这个线程启动之前
* 否则出现IllegalThreadStateException
*
* */