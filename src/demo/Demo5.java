package demo;

/**
 * Created by zxy on 2017/7/10.
 */
public class Demo5 {
    public static void main(String[] args) {
        short s = 5;
        //出错，int不能转化为
//        s = s+2;
          s += 2;
        int b = 28/3;
        //当两个整数进行相除时，如果不能整除，将把小数截断
        System.out.println(b);//9
    }
}
