package chapter7;

import java.util.*;

public class TestSychronized {
    public static void main(String[] args) {
//        创建四个线程安全的集合
        Collection<Object> collection = Collections.synchronizedCollection(new ArrayList<>());
        List<Object> list = Collections.synchronizedList(new ArrayList<>());
        Set<Object> set = Collections.synchronizedSet(new HashSet<>());
        Map<Object, Object> map = Collections.synchronizedMap(new HashMap<>());

//        ==============================================
        List<Object> emptyList = Collections.emptyList();//返回一个空的，不可变的集合对象
        Set singletonSet = Collections.singleton("Java");//包含指定对象，不可变的集合
        Map scores = new HashMap();
        scores.put("语文","90");
        scores.put("数学","80");
        Map unmodifiableMap = Collections.unmodifiableMap(scores);//指定集合的不可变视图
//      下面三行代码都抛出java.lang.UnsupportedOperationException
//        emptyList.add("android");
//        singletonSet.add("Android");
//        unmodifiableMap.put("英文u","23");
    }
}
