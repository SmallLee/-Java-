package chapter8;

public class TestMainDemo {
    public static void main(String[] args) {
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
/*
* 主方法需要运行时传入参数
* java TestMainDemo ONE TWO
*
* */