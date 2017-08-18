package chapter10;

import java.util.Date;

public class TestException {
    public static void main(String[] args) {
        try {
            Date d = null;
            d.toString();
        }catch (RuntimeException rep){
            System.out.println(rep);//java.lang.NullPointerException
            //java.lang.NullPointerException
//            at chapter10.TestException.main(TestException.java:9)
            rep.printStackTrace();//
        }
//        catch (NullPointerException e){编译出错
//
//        }
    }
}



/*
* Throwable:
*   -----Exception
*          -----RunTimeException
*   -----Error
*
*
* x先处理小异常，在处理大异常
* 不要在finally中使用return或者throw,会导致try中的return和throw失效
*
* */
