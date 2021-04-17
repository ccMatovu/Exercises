package StacksAndQueues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
* Write a method reverseHalf that reverses the order of half of the elements of a
*  Queue of integers. Your method should reverse the order of all the elements in
*  odd-numbered positions (position 1, 3, 5, etc.) assuming that the first value in
* the queue has position 0. For example, if the queue originally stores this sequence
*  of numbers when the method is called:

index: 0  1  2  3  4  5   6   7
front [1, 8, 7, 2, 9, 18, 12, 0] back
- it should store the following values after the method finishes executing:

index: 0  1  2  3   4  5  6   7
front [1, 0, 7, 18, 9, 2, 12, 8] back
Notice that numbers in even positions (positions 0, 2, 4, 6) have not moved. That
* sub-sequence of numbers is still: (1, 7, 9, 12). But notice that the numbers in odd
*  positions (positions 1, 3, 5, 7) are now in reverse order relative to the original.
*In other words, the original sub-sequence: (8, 2, 18, 0) - has become: (0, 18, 2, 8).
*  You may use a single stack as auxiliary storage.
*/
public class reverseHalf {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(6);
        q.add(8);
        q.add(4);
        q.add(1);
        q.add(7);
        q.add(2);
        q.add(9);

        System.out.println("Queue before "+ Arrays.toString(q.toArray()));

        reverseHalf re = new reverseHalf();
        re.reverseHalf(q);
        System.out.println("Queue after "+Arrays.toString(q.toArray()));


    }

    private void reverseHalf(Queue<Integer> q) {
        
    }
}
