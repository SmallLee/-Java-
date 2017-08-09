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
    }
}
