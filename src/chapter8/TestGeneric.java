package chapter8;

public class TestGeneric {
    public static void main(String[] args) {
        Apple<String> apple = new Apple<String>("苹果");
        apple.setInfo("香蕉");
        System.out.println(apple.getInfo());
        Apple<Integer> integerApple = new Apple<Integer>(23);
        integerApple.setInfo(3);
        System.out.println(integerApple.getInfo());
    }
}

class Apple<T>{
   public T info;
   Apple(T info){
       this.info = info;
   }

   public void setInfo(T info){
       this.info = info;
   }
   public T getInfo(){
       return info;
   }
}

class A extends Apple<String> {
    A(String info) {
        super(info);
    }

    @Override
    public void setInfo(String info) {
        super.setInfo(info);
    }

    @Override
    public String getInfo() {
        return "";
    }
}
/*
*
* JDK5引入了泛型
* */