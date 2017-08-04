package chapter6;

public class TestAnonymos {
    public void test(Product p){
        System.out.println("name"+p.getName()+"price: "+p.getPrice());
    }

    public static void main(String[] args) {
        TestAnonymos testAnonymos = new TestAnonymos();
        testAnonymos.test(new Product() {
            @Override
            public String getName() {
                return "龙珠";
            }

            @Override
            public String getPrice() {
                return "20";
            }
        });
    }
}

interface Product{
    String getName();
    String getPrice();
}