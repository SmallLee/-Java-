package chapter9;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloArg {
    public static void main(String[] args) {
        Locale currentLocale = null;
        if (args.length == 2) {
            currentLocale = new Locale(args[0],args[1]);
        } else {
            currentLocale = Locale.getDefault();
        }
        ResourceBundle bundle = ResourceBundle.getBundle("myRe", currentLocale);
        String msg = bundle.getString("msg");
        System.out.println(MessageFormat.format(msg,"我很好","星期三"));
    }
}
