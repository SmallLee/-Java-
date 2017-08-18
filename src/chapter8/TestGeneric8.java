package chapter8;

public class TestGeneric8 {
    public static void main(String[] args) {
        Student<Integer> s1 = new Student<Integer>();
        Integer info = s1.getInfo();
//        泛型丢失
        Student b = s1;
//        Integer binfo = b.getInfo();
        Number binfo = b.getInfo();
    }
}

class Student<T extends Number>{
    T info;
    public Student(){

    }
    public Student(T info){
        this.info = info;
    }
    public void setInfo(T info){
        this.info = info;
    }
    public T getInfo(){
        return info;
    }
}
/*
* 泛型擦除：
*当把一个具有泛型信息的变量复制给一个没有泛型信息的变量时，则尖括号中的泛型信息都被扔掉了
* 对元素的检查变成了泛型类型的上限
* */