package chapter9;

import java.text.NumberFormat;
import java.util.Locale;

public class TestNumberFormat {
    public static void main(String[] args) {
        double db = 1230000.43;
        Locale[] locale = {Locale.CHINA,Locale.JAPAN,Locale.US};
        NumberFormat[] nf = new NumberFormat[12];
        for (int i = 0; i < locale.length; i++) {
            nf[i*2] = NumberFormat.getNumberInstance(locale[i]);
            nf[i*2 + 1] = NumberFormat.getCurrencyInstance(locale[i]);
            nf[i*2 + 2] = NumberFormat.getPercentInstance(locale[i]);
        }
        for (int i = 0; i < locale.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("--------中国的格式---------");
                    break;
                case 1:
                    System.out.println("--------日本的格式---------");
                    break;
                case 2:
                    System.out.println("--------美国的格式---------");
                    break;
            }
            System.out.println("通用数值格式："+nf[i*2].format(db));
            System.out.println("通用货币格式："+nf[i*2 + 1].format(db));
            System.out.println("通用百分比格式："+nf[i*2 + 2].format(db));
        }
    }
}
