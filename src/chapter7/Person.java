package chapter7;

public class Person {
    public String name;
    public int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals");
        if (obj==null){
            return  false;
        }
        if (obj.getClass() == Person.class) {
            Person person = (Person) obj;
            return person.name.equals(this.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode");
        return name.hashCode();
    }
}
