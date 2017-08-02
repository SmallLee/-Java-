package demo;

/**
 * Created by zxy on 2017/7/20.
 */
public class TestFinalMethod {
    public static void main(String[] args) {

    }

    class Animal{
        public final void eat(){

        }
        //final方法可以重载
        public final void eat(String params){

        }
    }
    class Cat extends Animal{
        //出错，final方法不能重写
//        public void eat(){
//
//        }
    }
}
