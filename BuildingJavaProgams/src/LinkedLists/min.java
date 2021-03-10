public class min {
    int min(){
        if(font==null){
            throw new NoSuchFieldException();
        }

        ListNode curr = front;
        int mini = front.data;

        while(curr.next != null){
            if(curr.next.data < mini){
                mini = curr.next.data;
            }
            curr = curr.next;
        }
        return  mini;
    }
}
