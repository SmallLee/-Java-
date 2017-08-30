package chapter16;

public class Account {
    public String accountNo;
    public double balance;

    public Account(String accountNo,double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == Account.class) {
            Account target = (Account) obj;
            return target.accountNo.equals(this.accountNo);
        }
        return false;
    }
    public synchronized void draw(double amount){
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + "取钱成功" + amount);//1
            balance -= amount;//2
            System.out.println("余额为" + balance);//3
        } else {
            System.out.println(Thread.currentThread().getName() + "  取钱失败，余额不足");
        }
    }
}
/*
* 同步方法的监视器是this,因此对于同一个Account账户而言，任意时刻只能有一个线程获得对
* Account对象的锁定
* */