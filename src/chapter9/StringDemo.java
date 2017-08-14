package chapter9;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcdefg";
        String s3 = "abct";
        System.out.println(s1.compareTo(s2));//返回长度差
        System.out.println(s1.compareTo(s3));//返回t-d的差
        char[] c = {'a','b','c'};
        String valueOf = String.copyValueOf(c);//将字符数组转化为字符串
        System.out.println(valueOf);
        byte[] bytes = s1.getBytes();//将字符串改为字节数组
        System.out.println(bytes);

    }
}
/*
* IndexOf
* lastIndexof
* replace
* startsWith
* subString
* charAt
* toLowerCase
* */