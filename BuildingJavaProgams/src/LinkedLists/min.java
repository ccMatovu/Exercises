package LinkedLists;

import java.util.NoSuchElementException;

/*
Write a method min that returns the minimum value in a list of integers. If the list
 is empty, it should throw a NoSuchElementException.

Assume that you are adding this method to the LinkedIntList class as defined below:
public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}
* ***********************************************
public class min extends LinkedIntList{
    
    int min(){
        if(front == null){
            throw new NoSuchElementException();
        }
        ListNode curr = front;
        int mini = front.data;
        while(curr.next != null){
            if(curr.next.data < mini){
                mini = curr.next.data;
            }
            curr = curr.next;
        }
        return mini;
    }
}

*/
