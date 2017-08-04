package chapter6;

public class CreateInnerInstance {
    public static void main(String[] args) {
//        非静态内部类
        Out.Inner inner = new Out().new Inner();
//        静态内部类
        Out.StaticInner staticInner = new Out.StaticInner();
        inner.print("innerinstance");
    }
}

class Out{
    static class StaticInner{
        public void print(String msg){
            System.out.println(msg);
        }
    }
    class Inner{
        public void print(String msg){
            System.out.println(msg);
        }
    }
}
