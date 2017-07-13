package demo;

/**
 * Created by zxy on 2017/7/13.
 */
public class Sub extends Base {
    private String name;

    @Override
    public void test() {
        System.out.println(name.length());
    }
}
