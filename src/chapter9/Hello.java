package chapter9;

import java.util.Locale;
import java.util.ResourceBundle;

public class Hello {
    public static void main(String[] args) {
        //获取默认的Locale,此处是mess_zh_CN.properties
        Locale locale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("mess",locale);
        System.out.println(bundle.getString("hello"));
    }
}
/*
* 资源目录要放到src的根目录下，否则会报错
* 资源文件都必须是ISO-8859-1编码，因此，对于所有非西方语系的处理，都必须先将之转换为Java Unicode Escape格式。
* 转换方法是通过JDK自带的工具native2ascii.
* native2ascii.源资源文件 目的资源文件
* */