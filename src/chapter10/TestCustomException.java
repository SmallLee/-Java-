package chapter10;

public class TestCustomException {
    public static void main(String[] args) throws Exception {
        int i = 0;
        throwRuntim(i);
        throwChecked(i);
    }
    public static void throwRuntim(int i){
        if (i == 0) {
//            抛出RuntimeException,既可以显示捕获，也可以不处理
            throw new CustomException("i不能为0");
        }
    }

    public static void throwChecked(int i) throws Exception {
        if (i == 0) {
//            抛出Exception,必须try,catch或者在方法上声明
            throw new Exception("i不能为0");
        }
    }
}

class CustomException extends RuntimeException{
    public CustomException(){

    }
    CustomException(String msg){
        super(msg);
    }
}

/*
* 异常分为两类：
*   Checked异常和Runtime异常，所有RuntimeException类及其子类被称为RuntimeException
*
* */