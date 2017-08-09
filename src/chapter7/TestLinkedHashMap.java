package chapter7;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("name","zhangsan");
        linkedHashMap.put("age",12);
        linkedHashMap.put("address","beijing");
        System.out.println(linkedHashMap);//{name=zhangsan, age=12, address=beijing}
        for (Object key : linkedHashMap.keySet()){
            System.out.println(key+"--"+linkedHashMap.get(key));
        }
    }
}

/*
* LinkedHashMap也维护了元素的顺序
*
* */