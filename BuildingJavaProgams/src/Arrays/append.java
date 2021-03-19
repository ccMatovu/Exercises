package Arrays;

/*
* Write a method called append that accepts two integer arrays as
*  parameters and returns a new array that contains the result of
* appending the second array's values at the end of the first array.
* For example, if arrays list1 and list2 store {2, 4, 6}
* and {1, 2, 3, 4, 5} respectively, the call of append(list1, list2)
* should return a new array containing {2, 4, 6, 1, 2, 3, 4, 5}.*/

public class append {
    public static void main(String[] args) {
        int[] list1 ={1,3,2};
        int[] list2 ={5,2,9,8,7,5};
        int resultLenght = (list1.length + list2.length)-1;
        int[] listResult =new int[resultLenght];
        System.arraycopy(append(list1,list2),0,listResult,0,listResult);
    }
}
