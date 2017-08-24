package chapter14;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnnotation {
    public static void main(String[] args) throws Exception {
        Method method = Class.forName("chapter14.Test").getMethod("info");
        boolean isAnnotationPresent = method.isAnnotationPresent(MyTab.class);
        System.out.println(isAnnotationPresent);//true
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
            /*
            * @chapter14.MyTab(name=a, age=1)
            * */
            if (annotation instanceof MyTab) {
                MyTab myTab = (MyTab) annotation;
                System.out.println(myTab.name());//a
                System.out.println(myTab.age());//1
            }
        }
    }
}
