package chapter6;

public class TestFinalize {

    public void  info(){
        System.out.println("测试finalize方法");
    }
    static TestFinalize tf = null;
    public static void main(String[] args) throws InterruptedException {
        new TestFinalize();
        System.gc();
//        Thread.sleep(2000);
//        强制调用finalize方法
//        System.runFinalization();
//        Runtime.getRuntime().runFinalization();
        tf.info();
    }

    @Override
    protected void finalize() throws Throwable {
        tf = this;
    }
}
