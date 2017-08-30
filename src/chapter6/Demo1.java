package chapter6;


public class Demo1 {
    public static void main(String[] args) {
        Boolean b = new Boolean("True");//传入true或者True打印true
        System.out.println(b.booleanValue());
        String str = new String("http://。。。？1211２２３。２３＼：:");
        String str2 = "abcdａｂｃｄ.．．";
        String str3 = "http:／／www．baidu.com!！";
        System.out.println(toDBC(str3));
        System.out.println(Integer.toHexString(32));
    }
    public static String toDBC(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\u3000') {
                chars[i] = ' ';
            } else if (chars[i] > '\uFF00' && chars[i] < '\uFF5F') {
                chars[i] = (char) (chars[i] - 65248);

            }
        }
        return new String(chars);
    }
}
/*
* URLEncoder原字符和编码之后字符对应
* :         %3A
* /         %2F
* &         %26
* 空格       +
*  ?        %3F
*
*
*  不会被编码的字符
*  - _.*这四个字符
*
*
*  bgk编码汉字占两个字节，
*  utf8编码汉字占三个字节
* */