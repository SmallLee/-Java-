package demo;

/**
 * Created by zxy on 2017/7/14.
 */
public class Demo21 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("悟空");
        System.out.println(teacher);
    }
}

class Teacher{
    private String name;
    public Teacher(String name){
        this.name = name;
    }
    public void info(){
        System.out.println("此人名为："+name);
    }
}
