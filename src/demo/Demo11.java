package demo;

/**
 * Created by zxy on 2017/7/10.
 */
public class Demo11 {
    public static void main(String[] args) {
        say(1,2,3,4,5,6);
        int[] arr = {1,2,3,4};
        say(arr);
    }
    //多个参数被当成数组传入
    public static void say(int...words){
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
/*
* 可变参数只能有一个，并且在参数列表的最后
*  可以传入可变参数，也可以传入数组
* */