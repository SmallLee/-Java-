package chapter7;


import java.util.IdentityHashMap;

public class TestIdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        identityHashMap.put(new String("Java"),"好");
        identityHashMap.put(new String("Java"),"不好");
        identityHashMap.put("android","优秀");
        identityHashMap.put("android","及格");
        System.out.println(identityHashMap);//{Java=不好, Java=好, android=及格}
    }
}

/*
* HashMap判断两个键是否相等，是根据equals返回true，并且hashcode相同
* identityHashMap则是根据==，即严格相等，基本类型值相等，引用类型是一个对象
*
* */
