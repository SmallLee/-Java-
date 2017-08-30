package chapter16;

public class DrawThread extends Thread {
    private Account2 account;
    private double balance;
    public DrawThread(String name,Account2 account,double balance){
        super(name);
        this.account = account;
        this.balance = balance;
    }

    @Override
    public  void run() {
//        synchronized (account) {
//            if (account.balance >= balance) {
//                System.out.println(getName() + "取钱成功" + balance);//1
//                account.balance -= balance;//2
//                System.out.println("余额为" + account.balance);//3
//            } else {
//                System.out.println(getName() + "  取钱失败，余额不足");
//            }
//        }
        account.draw(balance);
    }
}
/*
*可能出现的情况如下
* one取钱成功600.0
two取钱成功600.0
余额为400.0
余额为-200.0
*
* 线程1在执行完代码1后，这时候线程2获得了处理器资源，开始执行，又执行了代码1，此时，线程1又获得了
* 处理器资源，显示余额为400，此时又轮到了线程2，开始执行代码2，此时输出的余额就为负数了
*
* 任何对象都可以做为同步监视器，但是通常使用可能被并发访问的资源作为同步监视器
* */