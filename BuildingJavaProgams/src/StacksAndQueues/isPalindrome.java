package StacksAndQueues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
* Write a method isPalindrome that takes a queue of integers as a parameter
*  and returns true if the numbers in the queue represent a palindrome
* (and false otherwise). A sequence of numbers is considered a palindrome if it
*  is the same in reverse order. For example, suppose a queue called q stores these
*  values:

front [3, 8, 17, 9, 17, 8, 3] back
Then the call of isPalindrome(q); should return true because this sequence is the
*  same in reverse order. If the queue had instead stored these values:
*
*

front [3, 8, 17, 9, 4, 17, 8, 3] back
The call on isPalindrome would instead return false because this sequence is not
* the same in reverse order (the 9 and 4 in the middle don't match). The empty
* queue should be considered a palindrome. You may not make any assumptions about
* how many elements are in the queue and your method must restore the queue so
*  that it stores the same sequence of values after the call as it did before.
*  You may use one stack as auxiliary storage.*/
public class isPalindrome {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(2);
        q.add(5);
        q.add(2);
        q.add(3);

        System.out.println(Arrays.toString(q.toArray()));

        System.out.println(isPalindrome(q));

        System.out.println(Arrays.toString(q.toArray()));
    }

    public static boolean isPalindrome(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        boolean palindrone = true;
        for(int i =0; i<q.size();i++){
            int element= q.remove();
            s.add(element);
            q.add(element);
        }

        for(int j =0; j<q.size(); j++){
            int checkElement = q.remove();
            q.add(checkElement);
            if(checkElement != s.pop()){
                palindrone = false;
            }
        }

        return palindrone;
    }
}
