package chapter9;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java");//在结尾追加
        sb.insert(0,"World");//在指定位置插入.WorldJava
        sb.replace(0,2,"aa");//aarldJava
        sb.delete(0,3);//ldJava
        System.out.println(sb.reverse());//avaJdl
        System.out.println(sb.length());//6
        System.out.println(sb.capacity());//16
        sb.setLength(3);//设置sb的长度，只保留前面的
        System.out.println(sb);//ava
    }
}
