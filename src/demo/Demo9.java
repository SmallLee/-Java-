package demo;

import java.util.Arrays;

/**
 * Created by zxy on 2017/7/10.
 */
public class Demo9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int index = Arrays.binarySearch(arr,10);
        System.out.println(index);//-8
        //复制数组
        int[] newArr = Arrays.copyOf(arr, 3);
        for (int i:newArr){
            System.out.println(i);//1,2,3
        }
        Arrays.fill(arr,4);
        for(int i : arr) {
            System.out.println(i);//全部为4
        }
    }
}
/*
* Arrays类中操作数组的方法
* binarySearch:二分查找
* copyOf:复制原来的数组，可以指定长度
* fill:把数组的元素都替换
* sort:排序
* */
