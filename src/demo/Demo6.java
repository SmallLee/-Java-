package demo;

/**
 * Created by zxy on 2017/7/10.
 */
public class Demo6 {
    public static void main(String[] args) {
        Integer inta = 2;
        Integer intb = 2;
        System.out.println(inta==intb);//true
        Integer intc = 128;
        Integer intd = 128;
        System.out.println(intc==intd);//false
        //==============================
        String s1 = new String("22");
        String s2 = new String("22");
        System.out.println(s1==s2);
        String s3 = "22";
        String s4 = "22";
        System.out.println(s3==s4);//true
    }
}

/*
* Integer的自动装箱，如果是-128-127之间的数，装箱后，会放入一个cache数组，如果下次再装箱-128-127之间的，
* 会直接指向cache数组中的元素，否则会重新创建一个integer对象
*
*
* */
