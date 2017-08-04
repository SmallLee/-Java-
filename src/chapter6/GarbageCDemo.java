package chapter6;

public class GarbageCDemo {
    public static void main(String[] args) {
        new Garbage();
//        System.gc();
        Runtime.getRuntime().gc();
    }
}

class Garbage{
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("准备回收对象11");
        throw new NullPointerException("空的");
    }
}

/*
*
* 一个对象在堆内存中有三种状态，
* 1.激活状态:对象被创建，有引用指向它
* 2.去活状态：对象没有引用指向
* 3.死亡状态：对象所有的引用都被切断，并且调用finalize方法后对象没有变成激活状态
*
*
* finalize方法注意事项：不要主动调用，交给垃圾回收器调用
* 何时被调用具有不确定性
* 执行去活对象的finalize后，可能变成激活状态
*
* */