package LinkedLists;
/*
* Write a method isSorted that returns true if the list is in sorted (nondecreasing)
*  order and returns false otherwise. An empty list is considered to be sorted.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}*/
public class IsSorted extends LinkedIntList {

    public static void main(String[] args) {
        LinkedIntList list = new IsSorted();
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(4);

        System.out.println("list = "+ list.toString());
        System.out.println("isSorted = "+list.isSorted());
    }
/**
    boolean isSorted(){

        if(front == null){
            return true;
        }
        ListNode current = this.front.next;
        boolean sorted = true;
        ListNode previous = front;

        while(current != null){
            if(current.data < previous.data){
                return false;
            }
            previous = current;
            current = current.next;

        }

        return sorted;
    }*/
}
