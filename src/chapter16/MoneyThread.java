package chapter16;

public class MoneyThread extends Thread {
    private MyAccount myAccount;
    private double money;

    public MoneyThread(String accountNo,MyAccount myAccount,double money){
        super(accountNo);
        this.money = money;
        this.myAccount = myAccount;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            myAccount.draw(money);
            System.out.println("取钱第"+(i++)+"次");
        }
        System.out.println("取钱结束");
    }
}
