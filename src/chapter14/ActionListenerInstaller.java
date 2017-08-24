package chapter14;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

public class ActionListenerInstaller {
    public static void processAnnotation(Object obj) throws Exception {
        //获取所有的字段
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            ActionListenerFor annotation = field.getAnnotation(ActionListenerFor.class);
            if (annotation != null) {
                //获取注解对应的类
                Class listenerClass = Class.forName("chapter14."+annotation.listener());
                ActionListener af = (ActionListener) listenerClass.newInstance();
                //获取字段对应的对象
                AbstractButton button = (AbstractButton) field.get(obj);
                button.addActionListener(af);
            }
        }
    }
}
