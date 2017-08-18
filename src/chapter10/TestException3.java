package chapter10;

public class TestException3 {
    static int price = 0;
    public static void main(String[] args) throws SaleException {
        try {
            calSale(price);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SaleException(e);
        }
    }
    public static void calSale(int i) throws SaleException{
        if (i == 0) {
        }
    }
}




class SqlException extends Exception{
    SqlException(){};
    SqlException(String msg){
        super(msg);
    }
}
class SaleException extends Exception{
    SaleException(){};
    SaleException(String msg){
        super(msg);
    }
    SaleException(Throwable throwable){
        super(throwable);
    }
}

/*
* 异常链：捕获原始异常，抛出业务异常
*
*
* */