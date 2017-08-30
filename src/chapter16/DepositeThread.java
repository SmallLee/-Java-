package chapter16;

public class DepositeThread extends Thread {
    private int count = 0;
    private MyAccount myAccount;
    private double money;

    public DepositeThread(String accountNo,MyAccount myAccount,double money){
        super(accountNo);
        this.money = money;
        this.myAccount = myAccount;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            myAccount.deposite(money);
            System.out.println("存钱第"+(i++)+"次");
        }
        System.out.println("存钱结束");
    }
}
