package chapter16;

import java.util.concurrent.locks.ReentrantLock;

public class Account2 {
    ReentrantLock reentrantLock = new ReentrantLock();
    public String accountNo;
    public double balance;

    public Account2(String accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == Account2.class) {
            Account2 target = (Account2) obj;
            return target.accountNo.equals(this.accountNo);
        }
        return false;
    }
    public synchronized void draw(double amount){
        try {
            reentrantLock.lock();
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + "取钱成功" + amount);//1
                balance -= amount;//2
                System.out.println("余额为" + balance);//3
            } else {
                System.out.println(Thread.currentThread().getName() + "  取钱失败，余额不足");
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }
}
/*
* 同步方法的监视器是this,因此对于同一个Account账户而言，任意时刻只能有一个线程获得对
* Account对象的锁定
* */