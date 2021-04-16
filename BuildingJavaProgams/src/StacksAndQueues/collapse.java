package StacksAndQueues;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
* Write a method collapse that takes a stack of integers as a parameter and that
* collapses it by replacing each successive pair of integers with the sum of the pair.
*  For example, suppose a stack stores these values:

bottom [7, 2, 8, 9, 4, 13, 7, 1, 9, 10] top
The first pair should be collapsed into 9 (7 + 2), the second pair should be collapsed
*  into 17 (8 + 9), the third pair should be collapsed into 17 (4 + 13) and so on to
*  yield:

bottom [9, 17, 17, 8, 19] top
If the stack stores an odd number of elements, the final element is not collapsed.
* For example, the stack:

bottom [1, 2, 3, 4, 5] top
Would collapse into:

bottom [3, 7, 5] top With the 5 at the top of the stack unchanged. You may use one
*  queue as auxiliary storage*/
public class collapse {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(4);
        s.add(5);
        s.add(9);
        s.add(1);
        s.add(3);
        s.add(8);

        System.out.println("Original stack"+ Arrays.toString(s.toArray()));

        collapse col = new collapse();
        col.collapse(s);
        System.out.println("\nCollapsed stack"+ Arrays.toString(s.toArray()));
    }

    public static void collapse(Stack<Integer> s){
        Queue<Integer> tempQ = new LinkedList<>();

        int size = s.size();

        if(size % 2 ==0){
            for (int i =0; i < size; i+=2){
                int element1 = s.pop();
                int element2 = s.pop();
                tempQ.add(element1+element2);
            }
        }else {
            tempQ.add(s.pop());
            for (int i =0; i < size-1; i+=2){
                int element1 = s.pop();
                int element2 = s.pop();
                tempQ.add(element1+element2);
            }
        }

        

    }
}
