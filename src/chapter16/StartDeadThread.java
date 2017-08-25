package chapter16;

public class StartDeadThread extends Thread{
    private int i;
    @Override
    public void run() {
        System.out.println("=========run");
        for ( ;i < 30; i++) {
            System.out.println(getName()+"  "+i);
        }
    }

    public static void main(String[] args) {
        StartDeadThread st = new StartDeadThread();
        for (int i = 0; i < 300; i++) {
            if (i==10) {
                st.start();
            }
            if (i >1 && !st.isAlive()) {
                System.out.println(st.isAlive());
                st.start();//.IllegalThreadStateException
            }
        }
    }
}
/*
* 只要还有任何非守护线程在运行，那么这个Java程序也在继续运行。
* 当该程序中所有的非守护线程都终止时，虚拟机实例将自动退出。
*
* 新建和死亡状态的线程，isAlive方法返回false
* */