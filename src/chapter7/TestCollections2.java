package chapter7;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(-1);
        arrayList.add(13);
        arrayList.add(4);
        arrayList.add(10);
        Collections.sort(arrayList);
        System.out.println(Collections.binarySearch(arrayList,10));//2
        System.out.println(Collections.max(arrayList));///13
        System.out.println(Collections.min(arrayList));//-1
//        Collections.fill(arrayList,3);
//        System.out.println(arrayList);//[3, 3, 3, 3]
//        集合中指定元素出现的次数
        System.out.println(Collections.frequency(arrayList,4));//1
//        替换所有元素
        Collections.replaceAll(arrayList, 4, 2);
        System.out.println(arrayList);//[-1, 2, 10, 13]
    }
}
