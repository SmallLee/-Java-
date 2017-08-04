package chapter6;

public class Demo4 {
    public static void main(String[] args) {
        Shape shape= new Circle();
        shape.calLength();
    }
}

abstract class Shape{
    abstract void calLength();
}
class Circle extends Shape{
    public void calLength(){
        System.out.println("shape");
    }
}
/*
* abstract和final不能同时存在
*
* */