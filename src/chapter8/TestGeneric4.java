package chapter8;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric4 {
    public static void main(String[] args) {
        List<?> arraylist = new ArrayList<String>();
//        编译出错
//        arraylist.add(new Object());
        ArrayList<Shape> shapeList= new ArrayList<Shape>();
        shapeList.add(new Circle());
        shapeList.add(new Rectangle());
        Canvas canvas = new Canvas();
        canvas.drawAll(shapeList);
    }
}

class Canvas{
//    通配符上限
    public void drawAll(List<? extends Shape> shapes){
        for(Shape shape :  shapes){
            shape.draw();
        }
    }
}
class Shape{
    public void draw(){

    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}

class Rectangle  extends Shape{
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}
