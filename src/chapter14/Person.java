package chapter14;

@Persistent(table = "person_table")
public class Person {
    @IdProperty(column = "person_id",type = "integer",generator = "identity")
    public int id;
    @Property(column = "person_age",type = "string")
    public String age;
    @Property(column = "person_name",type = "string")
    public String name;

    public Person(int id,String name,String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
