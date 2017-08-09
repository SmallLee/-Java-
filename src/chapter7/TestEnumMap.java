package chapter7;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class TestEnumMap {
    public static void main(String[] args) {
        EnumMap enumMap = new EnumMap(Color.class);
        enumMap.put(Color.RED,"红色");
        enumMap.put(Color.GREEN,"绿色");
        enumMap.put(Color.BLUE,"蓝色");
        Set<Map.Entry> set = enumMap.entrySet();
        for (Map.Entry entry : set) {
            System.out.println(entry.getKey()+"--"+entry.getValue());
           /* RED--红色
            GREEN--绿色
            BLUE--蓝色*/

        }
    }
}

enum Color{
    RED,GREEN,BLUE
}

/*
*EnumMap用来存储枚举
*
*
* */
