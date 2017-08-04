package chapter6;

import java.lang.ref.WeakReference;

public class TestReference {
    public static void main(String[] args) {
        String str = new String("创建的对象");
//        String str = "创建的对象";
        WeakReference weakReference = new WeakReference(str);
        str = null;
        System.out.println(weakReference.get());//创建的对象
        System.gc();
        System.runFinalization();
        System.out.println(weakReference.get());//null
    }
}
/*
* 上面的程序，不要使用
* String str = "创建的对象";
* 因为系统会缓存这个字符串常量(在方法区的常量池)，系统不会回收这里被缓存的字符串常量
*
* */


/*
* java中的四种引用类型：
* 强引用：创建对象，有一个或一个以上引用指向它，默认都是强引用
* 软引用：SoftReference 内存足够，系统不回收，内存不够，回收，软引用通常用于内存敏感的程序中
* 弱引用：WeakReference 引用级别更低 当垃圾回收器运行时，不管内存是否够 总会回收
* 虚引用：PhantomReference 类似没有引用 主要用于跟踪对象被垃圾回收的状态，虚引用不能单独使用
* 要和引用队列联合使用，检查虚引用关联的队列中是否已经包含该虚引用，从而了解对象是否即将被回收
*
* 引用队列用于保存被回收对象的引用
* 除了虚引用，其他都是回收之后保存
* */