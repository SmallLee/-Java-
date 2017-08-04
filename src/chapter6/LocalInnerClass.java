package chapter6;

public class LocalInnerClass {
    public static void main(String[] args) {
        class InnerClass{
            int a;
        }
        class InnerSub extends InnerClass{
            int b;
        }
        InnerSub sub = new InnerSub();
        sub.a=10;
        sub.b=12;
        System.out.println("a和b的值是"+sub.a+"----"+sub.b);//a和b的值是10----12
    }
}


/*
* 局部内部类：内部类定义在方法里
* 局部类不能使用static修饰，因为局部类的上级是方法，使用static没有意义
* 局部类不能使用访问修饰符，因为其他成员不会访问方法内的成员
* */