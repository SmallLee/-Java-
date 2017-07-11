package demo;

/**
 * Created by zxy on 2017/7/10.
 */
public class Demo8 {
    public static void main(String[] args) {
        String[] books = {"疯狂Android讲义","疯狂Java讲义","疯狂Html讲义"};
        for (String book:books) {
            book = "各种讲义";
            System.out.println(book);//各种讲义
        }
        System.out.println(books[0]);//疯狂Android讲义
    }
}
/*
* foreach不能改变元素的值
* */