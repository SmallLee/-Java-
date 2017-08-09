package chapter7;

import java.util.EnumSet;

public class TestEnumSet {
    public static void main(String[] args) {
        //创建一个EnumSet集合，存储的元素是Season枚举所有值
        EnumSet<Season> seasons = EnumSet.allOf(Season.class);
        System.out.println(seasons);//[SPRING, AUTOM, FALL, WINTER]
        //初始化一个EnumSet集合，空的，元素类型为Season
        EnumSet<Season> seasons2 = EnumSet.noneOf(Season.class);
        System.out.println(seasons2);//[]
        //以指定枚举创建集合
        EnumSet<Season> seasons1 = EnumSet.of(Season.AUTOM, Season.WINTER);
        System.out.println(seasons1);//[AUTOM, WINTER]
        EnumSet<Season> seasons3 = EnumSet.range(Season.AUTOM, Season.WINTER);
        System.out.println(seasons3);//[AUTOM, FALL, WINTER]
        //枚举中剩下的元素
        EnumSet<Season> seasons4 = EnumSet.complementOf(seasons3);
        System.out.println(seasons4);//[SPRING]
    }
}
enum Season{
    SPRING,AUTOM,FALL,WINTER;
}
