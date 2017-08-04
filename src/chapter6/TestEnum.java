package chapter6;

public class TestEnum {
    public static void main(String[] args) {
        for (Season s : Season.values()){
            System.out.println(s);//打印出所有的值
        }
        System.out.println(Season.SPRING.name());//SPRING
        //比较
        System.out.println(Season.SPRING.compareTo(Season.SUMMER));//-1
        System.out.println(Season.WINTER.compareTo(Season.SUMMER));//2
        //获取索引值
        System.out.println(Season.FALL.ordinal());
//        创建对象
        Season season = Season.valueOf(Season.class,"SPRING");
    }
}

enum Season {
    SPRING(1),
    SUMMER(2),
    FALL(3),
    WINTER(4);

    private int value;
    Season(int value){
        this.value = value;
    }
}

/*
*枚举类默认继承了java.lang.Enum类
* 枚举的构造器只能用private修饰，默认是private
* 所有枚举类都提供了一个values方法
*
* Season.values返回一个所有值的数组
* */