package chapter6;

public class TestGenderEnum {
    public static void main(String[] args) {
        Gender male = Gender.valueOf(Gender.class, "MALE");
        male.setName("男");
        System.out.println(male.name);
    }
}

enum Gender{
    MALE,FEMALE;
    public String name;

    public void setName(String name){
        switch (this){
            case MALE:
                if(name.equals("男")){
                    this.name = name;
                } else {
                    System.out.println("参数错误");
                    return;
                }
                break;
            case FEMALE:
                if(name.equals("女")){
                    this.name = name;
                } else {
                    System.out.println("参数错误");
                    return;
                }
                break;
        }
    }
}
