package chapter6;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class TestPhantomReference {
    public static void main(String[] args) {
        String str = new String("创建的对象");
        ReferenceQueue fq = new ReferenceQueue();
        PhantomReference prf = new PhantomReference(str,fq);
        str = null;
        System.out.println(prf.get());//null
        System.gc();
        System.runFinalization();
        System.out.println(fq.poll() == prf);//true
    }
}
/*
* 虚引用无法获取他引用的对象
*
* */