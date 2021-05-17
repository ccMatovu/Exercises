package StacksAndQueues;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
* Write a method reorder that takes a queue of integers as a parameter and that puts
*  the integers into sorted (nondecreasing) order assuming that the queue is already
*  sorted by absolute value. For example, suppose that a variable called q stores
*  the following sequence of values:

front [1, 2, -2, 4, -5, 8, -8, 12, -15, 23] back
Notice that the values appear in sorted order if you ignore the sign of the numbers.
*  The call of reorder(q); should reorder the values so that the queue stores this
*  sequence of values:

front [-15, -8, -5, -2, 1, 2, 4, 8, 12, 23] back
Notice that the values now appear in sorted order taking into account the sign of
*  the numbers. You may use one stack as auxiliary storage to solve this problem.*/
public class reorder {
    public static void main(String[] args) {
        Queue<Integer> q  = new LinkedList<>();
        q.add(3);
        q.add(2);
        q.add(-2);
        q.add(4);
        q.add(-5);
        q.add(8);
        q.add(-8);

        System.out.println("Queue before = "+ Arrays.toString(q.toArray()));
        reorder(q);
        System.out.println("Queue after reorder = "+ Arrays.toString(q.toArray()));
    }

    public static void reorder(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            int element = q.remove();

            for(int j=q.size(); j > 0; j--){
                if(q.peek() > element){
                    q.add(element);
                    element = q.remove();
                }else{
                    q.add(q.remove());
                }
            }
            s.add(element);
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
}
