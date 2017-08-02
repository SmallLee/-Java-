package demo;

/**
 * Created by zxy on 2017/7/18.
 */
public class SingleInstanceDemo {
    public static void main(String[] args) {
        SingleTon instance = SingleTon.getInstance();
    }
}

class SingleTon{
    private static SingleTon mInstance = new SingleTon();
    private SingleTon(){}
    public static SingleTon getInstance(){
        if (mInstance==null) {
            mInstance = new SingleTon();
        }
        return mInstance;
    }
}
