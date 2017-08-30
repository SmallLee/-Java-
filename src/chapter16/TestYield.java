package chapter16;

public class TestYield extends Thread {

    public TestYield(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0;  i < 50 ; i++) {
            System.out.println(getName()+"  "+i);
            if (i==20) {
                yield();
            }
        }
    }

    public static void main(String[] args) {
        TestYield ty1 = new TestYield("高级");
        ty1.setPriority(MAX_PRIORITY);
        ty1.start();
        TestYield ty2 = new TestYield("低级");
        ty2.setPriority(MIN_PRIORITY);
        ty2.start();
    }
}
/*
* 1.yield:让当前处于运行状态的线程转入就绪状态，让当前线程暂停，让系统调度器重新调度，有可能这个线程又获得调度器开始执行
* 2.当线程调用了yield方法暂停之后，只有优先级与当前线程相同，1或者比当前线程优先级高的就绪状态的线程才能获得执行机会
*
* 线程优先级有1，5，10，5是默认的优先级
* */