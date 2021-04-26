package LinkedLists;
/*
* Write a method set that accepts an index and a value and sets the list's element at
*  that index to have the given value. You may assume that the index is between 0
*  (inclusive) and the size of the list (exclusive).

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}
public class set {
    void set(int index, int val){
        ListNode current = front;
        index--;
        while(index >= 0){
            index--;
            current = current.next;
        }
        current.data = val;
    }
}
*/