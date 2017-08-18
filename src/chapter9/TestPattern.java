package chapter9;

public class TestPattern {
    public static void main(String[] args) {
        String str = "java ,hello";
        System.out.println(str.replaceFirst("\\w*","--"));//-- ,hello
        System.out.println(str.replaceFirst("\\w*?","--"));//--java ,hello
    }
}

/*
* *零次或多次
* + 一次或多次
* ？0次或一次
* . 除换行符\n之外的任何单字符
* \d  匹配0-9的数字
* \s 匹配所有空白字符 包括空格，制表符，换页符，回车符
* \w 匹配所有单词字符 包括0-9数字，a-z字母以及下划线_
*
* 正则表达支持的数量标识符有如下几种模式：
* 1.Greedy模式(贪婪模式) 默认的，一直匹配下去
* 2.勉强模式：匹配最少的字符,用问号?后缀表示
* 3.占有模式，用加号+后缀表示
* */
