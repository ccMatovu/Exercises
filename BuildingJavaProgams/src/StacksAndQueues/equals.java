package StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

/*
*Write a method equals that takes as parameters two stacks of integers and returns true
*  if the two stacks are equal and that returns false otherwise. To be considered
* equal, the two stacks would have to store the same sequence of integer values in the
*  same order. Your method is to examine the two stacks but must return them to their
*  original state before terminating. You may use one stack as auxiliary storage. */
public class equals {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(3);
        stack1.push(3);
        stack1.push(4);
        stack2.push(3);
        stack2.push(3);
        stack2.push(6);

        System.out.println("Stack one "+ Arrays.toString(stack1.toArray()));
        System.out.println("Stack two "+ Arrays.toString(stack2.toArray()));

        equals check = new equals();
        boolean checkResult = check.equals(stack1,stack2);

        System.out.println("\nIt is "+checkResult+" that they are equal");
    }

    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2){

        boolean same = true;
        Stack<Integer> temporaryStack = new Stack<>();

        if(stack1.size() != stack2.size()){
            return false;
        }

        while (same && !stack1.isEmpty()){
            if(stack1.peek().equals( stack2.peek())){
                temporaryStack.add(stack1.pop());
                stack2.pop();
            }else{
                same = false;
            }
        }

        while (!temporaryStack.isEmpty()){
            int element = temporaryStack.pop();
            stack1.push(element);
            stack2.push(element);
        }
        return same;
    }

}
