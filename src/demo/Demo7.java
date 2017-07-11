package demo;

/**
 * Created by zxy on 2017/7/10.
 */
public class Demo7 {
    public static void main(String[] args) {
        //调用绘图函数，参数是圆的半径
        paint(8);
    }

    public static void paint(int r){
//假定圆心在坐标（r，r）处
        int x = 0;//x的坐标开始
        int y = 0;//y的坐标开始
        int c = 0;//中间空格数
        int z = 2;//每行递减量，步长设为2是为了调节屏幕纵横比。

        for (int i = 0; i <= r*2; i += z){
//获取画*点的坐标的x值
            x = getX(r, y);
//先画y值上左边的*
            System.out.print(getSpace(x)+"*");
            c = (r-x)*2;//以圆心对应输出空格
//再画该y值上右边的*
            System.out.println(getSpace(c)+"*");
//每次y值递减
            y += z;
        }
    }

    public static int getX(int r, int y){
//取直角三角形长边长
        int h = y - r;
//求直角三角形短边长
        double l = Math.sqrt((r*r)-(h*h));
//取x值，Math.round()返回最接近的整数
        return (int) Math.round(r-l);
    }

    public static String getSpace(int i){
        String s = "";
        for(int j = 0; j<i; j++){
            s += " ";
        }
        return s;
    }
    }
