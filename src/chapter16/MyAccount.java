package chapter16;

public class MyAccount {
    private String accountNo;
    private double amount;
    //标识账户中是否已经有存款
    private boolean flag = false;
    public MyAccount(String accountNo,double amount){
        this.accountNo = accountNo;
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
    public synchronized void draw(double money){
        try {
            if (!flag) {//没有存款，等待
                wait();
            } else {
                System.out.println(Thread.currentThread().getName()+"取钱"+money);
                amount -= money;
                System.out.println("账户余额为"+amount);
                flag = false;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void deposite(double money){
        try {
            if (flag) {
                wait();
            } else {
                System.out.println(Thread.currentThread().getName()+"存钱"+money);
                amount += money;
                System.out.println("账户余额为"+amount);
                flag = true;
                notifyAll();
            }
        } catch (Exception e) {

        }
    }
}
