package chapter7;

import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(11);
        pq.offer(2);
        pq.offer(3);
        pq.offer(15);
        System.out.println(pq.poll());;
        System.out.println(pq.poll());;
        System.out.println(pq);
    }
}
/*
* PriorityQueue保存队列元素的顺序并不是加入的顺序，而是按队列元素的大小排序
* 因此当调用peek或者poll取出元素时，并不是取出最先进入的元素，而是最小的元素
*
* 注意：直接输出PriorityQueue对象，看不到集合里元素的顺序
*
* PriorityQueue可以进行自然排序和定制排序，和TreeSet一样
* */