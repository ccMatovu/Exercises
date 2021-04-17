package StacksAndQueues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
* Write a method rearrange that takes a queue of integers as a parameter and
*  rearranges the order of the values so that all of the even values appear before
*  the odd values and that otherwise preserves the original order of the list. For
*  example, suppose a queue called q stores this sequence of values:

front [3, 5, 4, 17, 6, 83, 1, 84, 16, 37] back
Then the call of rearrange(q); should rearrange the queue to store the following
*  sequence of values:

front [4, 6, 84, 16, 3, 5, 17, 83, 1, 37] back
Notice that all of the evens appear at the front of the queue followed by the odds
*  and that the order of the evens is the same as in the original list and the order
*  ohf the odds is the same as in the original list. You may use one stack as
*  auxiliary storage.g*/
public class rearrange {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(3);
        q.add(7);
        q.add(2);
        q.add(8);

        System.out.println("Queue before rearrangement "+ Arrays.toString(q.toArray()));

        rearrange re = new rearrange();
        re.rearrange(q);
        System.out.println("\nQueue after rearrangement "+Arrays.toString(q.toArray()));

        System.out.println("\nQueue after rearrangement "+Arrays.toString(q.toArray()));

    }
    public void rearrange(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<2;i++){
            for(int j = q.size(); j > 0; j--){
                if(q.peek() % 2 !=0){
                    s.add(q.remove());
                }else{
                    q.add(q.remove());
                }
            }

            for(int z = s.size(); z >0; z--){
                q.add(s.pop());
            }
        }

    }
}
