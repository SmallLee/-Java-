package chapter6;

public class TestClosure2 extends Programmar2 {
    public TestClosure2(String name) {
        super(name);
    }
    public void teach() {
        System.out.println("=====讲课");
    }

    private class Closure implements Teachable2{
        @Override
        public void work() {
            teach();
        }
    }
    public Teachable2 getClosure(){
        return new Closure();
    }

    public static void main(String[] args) {
        TestClosure2 testClosure2 = new TestClosure2("zhangsan");
        testClosure2.work();//编程
        testClosure2.getClosure().work();//讲课
    }
}
interface Teachable2{
    void work();
}
class Programmar2{
    private String name;
    public Programmar2(String name){
        this.name = name;
    }
    public void work(){
        System.out.println(name+"编程");
    }
}