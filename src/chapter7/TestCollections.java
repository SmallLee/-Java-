package chapter7;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(-2);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(10);
        System.out.println(arrayList);//[-2, 5, 3, 10]
//        反转
        Collections.reverse(arrayList);
        System.out.println(arrayList);//[10, 3, 5, -2]
//        排序
        Collections.sort(arrayList);
        System.out.println(arrayList);//[-2, 3, 5, 10]
        //随机排序
        Collections.shuffle(arrayList);
        System.out.println(arrayList);//[-2, 10, 5, 3]
//        交换两个位置的元素
        Collections.swap(arrayList,1,3);
        System.out.println(arrayList);
        Collections.rotate(arrayList,2);
        System.out.println(arrayList);//[5, 3, -2, 10]
    }
}
