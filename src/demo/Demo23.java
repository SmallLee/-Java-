package demo;

/**
 * Created by zxy on 2017/7/14.
 */
public class Demo23 {
    public static void main(String[] args) {
        Dog dog = new Dog(22,"jack");
        Dog dog2 = new Dog(22,"jack");
        Dog dog3 = new Dog(22,"mike");
        System.out.println(dog.equals(dog2));//true
        System.out.println(dog2.equals(dog3));//false
        Cat cat = new Cat(22,"lili");;//false
        System.out.println(dog.equals(cat));
    }
}

class Dog{
    private int age;
    private String name;

    public Dog(int age,String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        //当instanceof操作符前面的对象是后面的实例或者子类实例时，都将返回true
        //所以实际上重写equals判断两个对象是否是同一个类时的实例时使用instanceof
        //判断是有问题的
//        if (obj!=null&obj instanceof Dog) {
//            Dog dog = (Dog) obj;
//            if(this.age==dog.age&&this.name.equals(dog.name)){
//                return true;
//            }
//        }
        if (obj!=null&obj.getClass()==Dog.class) {
            Dog dog = (Dog) obj;
            if(this.age==dog.age&&this.name.equals(dog.name)){
                return true;
            }
        }
        return false;
    }
}
class Cat{
    private int age;
    private String name;

    public Cat(int age,String name){
        this.age = age;
        this.name = name;
    }
}
