package chapter16;

public class TestDraw {
    public static void main(String[] args) {
        Account2 account = new Account2("1022",1000);
        DrawThread dt1 = new DrawThread("one",account,600);
        dt1.start();
        DrawThread dt2 = new DrawThread("two",account,600);
        dt2.start();
    }
}
