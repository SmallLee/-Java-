package chapter6;

public class TestClosure extends Programmar implements Teachable {

    public TestClosure(String name) {
        super(name);
    }

    public static void main(String[] args) {
        TestClosure testClosure = new TestClosure("adf");
        testClosure.work();//adf编程
    }
}

interface Teachable{
    void work();
}
class Programmar{
    private String name;
    public Programmar(String name){
        this.name = name;
    }
    public void work(){
        System.out.println(name+"编程");
    }
}
