package chapter9;

import java.util.Locale;

public class LocalList {
    public static void main(String[] args) {
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i = 0; i < availableLocales.length; i++) {
            //打印支持的国家和语言
            System.out.println(availableLocales[i].getDisplayName()+availableLocales[i].getLanguage());
        }
    }
}
