package chapter14;

public class Test {
    //使用带成员变量的Anotation，需要为成员变量赋值
    @MyTab(name = "a",age = 1)
    public void info(){

    }
    //使用带默认值的注解可以不赋值
    @MyTab2
    public void info2(){

    }
    @Testable
    public void m1(){
        System.out.println("==============m1");
    }
    public void m2(){

    }
    @Testable
    public void m3(){
        System.out.println("==============m2");
    }
    @Testable
    public void m4(){
        System.out.println("==============m4");
        throw new RuntimeException("Crash");
    }
}
/*
* 使用Annotation相关方法需要给注解添加@Retention(RetentionPolicy.RUNTIME)，否则无法得到期望的结果
*
* */