package chapter6;

public class TestStatic {
    private class In{};
    public static void main(String[] args) {
//        new In();编译错误，静态方法不能访问非静态成员
    }
}
