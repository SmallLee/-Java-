package chapter6;

 enum  EnumImpl implements Info {
    MALE{
        @Override
        public void info() {
            System.out.println("男的");
        }
    },
    FEMALE{
        @Override
        public void info() {
            System.out.println("女的");
        }
    };
}

interface Info{
    void  info();
}
public class EnumImplTest{
    public static void main(String[] args) {
        EnumImpl.MALE.info();
        EnumImpl.FEMALE.info();
    }
}

/*
* 不同枚举值有不同的行为
*
* FEMALE和MALE实际是匿名子类，而不是实例
* */