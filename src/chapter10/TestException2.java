package chapter10;

public class TestException2 {
    public double initPrice = 30.0;

    public void bid(String dPrice) throws AuctionException {
        double d = 0.0;
        try{
            d = Double.parseDouble(dPrice);
        } catch (Exception e){
            throw new AuctionException("价格必须是数字");
        }

        if (initPrice  > d) {
            throw new AuctionException("价格不对");
        }
    }

    public static void main(String[] args) {
        TestException2 testException2 = new TestException2();
        try {
            testException2.bid("ad");
        } catch (AuctionException e) {
//            System.out.print(e.getMessage());
            System.err.print(e.getMessage());//打印红色的价格不对
        }
    }
}


class AuctionException extends Exception{
    public AuctionException(){};

    AuctionException(String msg){
        super(msg);
    }
}