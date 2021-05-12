package StacksAndQueues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
* Write a method isConsecutive that takes a stack of integers as a parameter and
*  that returns whether or not the stack contains a sequence of consecutive integers
*  starting from the bottom of the stack (returning true if it does, returning false
*  if it does not). Consecutive integers are integers that come one after the other,
*  as in 5, 6, 7, 8, 9, etc. So if a stack s stores the following values:

bottom [3, 4, 5, 6, 7, 8, 9, 10] top
Then the call of isConsecutive(s) should return true. If the stack had instead
*  contained this set of values:

bottom [3, 4, 5, 6, 7, 8, 9, 10, 12] top
Then the call should return false because the numbers 10 and 12 are not consecutive. Notice that we look at the numbers starting at the bottom of the stack. The following sequence of values would be consecutive except for the fact that it appears in reverse order, so the method would return false:

bottom [3, 2, 1] top
Your method must restore the stack so that it stores the same sequence of values
*  after the call as it did before. Any stack with fewer than two values should be
* considered to be a list of consecutive integers. You may use one queue as
*  auxiliary storage to solve this problem.*/
public class isConsective {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        System.out.println(Arrays.toString(s.toArray()));

        System.out.println(isConsecutive(s));

        System.out.println(Arrays.toString(s.toArray()));
    }

    public static boolean isConsecutive(Stack<Integer> s){
        Queue<Integer> q = new LinkedList<>();
        boolean consective = true;
        while(!s.isEmpty()){
          int element = s.pop();

            q.add(element);

          try {
              if ((element - 1) != s.peek()) {
                  consective = false;
              }
          }catch (Exception e){
              continue;
            }
        }

        while (!q.isEmpty()){
            s.add(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        while (!q.isEmpty()){
            s.add(q.remove());
        }
        return consective;
    }
}
