package chapter9;

public class TestObject {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("张三");
        System.out.println(user);
        User user2 = user.clone();
        System.out.println(user==user2);
        System.out.println(user.address==user2.address);//true
    }
}

class Address{
    String detail;
    public Address(String detail){
        this.detail = detail;
    }
}

class User implements Cloneable{
    String name;
    Address address;

    public User(String name){
        this.name = name;
        address = new Address("北京");
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
