package StacksAndQueues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*Write a method stutter that takes a stack of integers as a parameter and replaces
every value in the stack with two occurrences of that value For example, suppose the
 stack stores these values:

bottom [3, 7, 1, 14, 9] top
Then the stack should store these values after the method terminates:

bottom [3, 3, 7, 7, 1, 1, 14, 14, 9, 9] top
Notice that you must preserve the original order. In the original list the 9 was at
 the top and would have been popped first. In the new stack the two 9s would be the
  first values popped from the stack. You may use a single queue as auxiliary
  storage to solve this problem*/
public class stutter {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(4);
        q.add(6);
        q.add(-1);
        q.add(3);
        q.add(-5);

        Stack<Integer> s = new Stack<>();

        System.out.println(Arrays.toString(q.toArray()));

        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        System.out.println(Arrays.toString(s.toArray())+"\n\n");

        stutter check = new stutter();
        stutter.stuttter(s);

        System.out.println(Arrays.toString(s.toArray()));
    }

    public static void stuttter(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
        int element;
        while (!s.isEmpty()) {
            element = s.pop();
            q.add(element);
            q.add(element);
        }
        while (!q.isEmpty()) {
            element = q.remove();
            s.add(element);
        }

        while (!s.isEmpty()){
            element = s.pop();
            q.add(element);
        }
        while (!q.isEmpty()){
            element = q.remove();
            s.add(element);
        }
    }
}