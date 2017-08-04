package chapter6;

public class AccessStaticInnerClass {
    static class InnerClass{
        private static int age = 10;
        public String address = "Nihaoma";
    }

    public static void main(String[] args) {
//        编译出错，无法访问
//        System.out.println(age);
        System.out.println(InnerClass.age);
        System.out.println(new InnerClass().address);
    }
}
/*
* 外部类要访问内部类的成员
*   访问静态属性要通过类名
*   访问实例属性要通过实例
* */