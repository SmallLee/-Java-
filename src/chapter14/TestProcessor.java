package chapter14;

import java.lang.reflect.Method;

public class TestProcessor {
    public static void process() throws ClassNotFoundException {
        Class aClass = Class.forName("chapter14.Test");
        int success = 0;
        int failed = 0;
        //获取Test类中所有的方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            boolean annotationPresent = method.isAnnotationPresent(Testable.class);
            //如果包含@Testable接口
            if (annotationPresent) {
                try {
                    Test test = (Test) aClass.newInstance();
                    method.invoke(test);
                    success++;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("方法"+ method+"运行失败" +"\n"+ e.getCause()+"failed"+failed++);
                }
            }
        }
        System.out.println("共运行了"+(success+failed)+"个方法"+"成功方法个数为"+success+",失败方法个数为： "+failed);
    }

    public static void main(String[] args) throws Exception {
        TestProcessor.process();
    }
}
