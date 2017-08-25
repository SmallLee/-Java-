package chapter16;

public class FirstThread extends Thread {
    private int i;
    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName()+"  "+i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+""+i);
            if (i ==20) {
                new FirstThread().start();
                new FirstThread().start();
            }
        }
    }
}
/*
* 使用继承Thread类的方法创建线程，多条线程无法共享线程类的实例变量
*
* */