package chapter16;

public class TestDrawAndDepo {
    public static void main(String[] args) {
        MyAccount myAccount = new MyAccount("123",600);
        new MoneyThread("甲",myAccount,200).start();
        new MoneyThread("甲2",myAccount,200).start();
        new DepositeThread("丙",myAccount,400).start();
        new DepositeThread("丙2",myAccount,200).start();
    }
}

/*
* 当存钱次数和取钱次数不一致时，会导致程序阻塞
* */