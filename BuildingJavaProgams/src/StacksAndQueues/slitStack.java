package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
* Write a method splitStack that takes a stack of integers as a parameter and
*  splits it into negatives and non-negatives. The numbers in the stack should
*  be rearranged so that all the negatives appear on the bottom of the stack
*  and all the non-negatives appear on the top. In other words, if after this
*  method is called you were to pop numbers off the stack, you would first
*  get all the nonnegative numbers and then get all the negative numbers.
*  It does not matter what order the numbers appear in as long as all the
* negatives appear lower in the stack than all the non-negatives.
* You may use a single queue as auxiliary storage.*/
public class slitStack {
    public static void main(String[] args) {
        System.out.println("Check complete");
    }

    public void splitStack(Stack<Integer> stack) {

        Queue<Integer> tempQueue = new LinkedList<Integer>();
        int numNegatives = 0;

        while(!stack.isEmpty()) {
            if(stack.peek() < 0) {
                numNegatives++;
            }
            tempQueue.add(stack.pop());
        }

        while(numNegatives > 0) {
            if(tempQueue.peek() < 0) {
                stack.push(tempQueue.remove());
                numNegatives--;
            } else {
                tempQueue.add(tempQueue.remove());
            }
        }

        while(!tempQueue.isEmpty())
            stack.push(tempQueue.remove());
    }

}
