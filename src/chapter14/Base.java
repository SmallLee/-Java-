package chapter14;

@Inheritable
public class Base {
}

class Child extends Base{
    public static void main(String[] args) {
        System.out.println(Child.class.getClass());//class java.lang.Class
        System.out.println(Child.class);//class chapter14.Child
        boolean present = Child.class.isAnnotationPresent(Inheritable.class);
        System.out.println(present);//true
    }
}
