package Arrays;

/*
* Write a method called append that accepts two integer arrays as
*  parameters and returns a new array that contains the result of
* appending the second array's values at the end of the first array.
* For example, if arrays list1 and list2 store {2, 4, 6}
* and {1, 2, 3, 4, 5} respectively, the call of append(list1, list2)
* should return a new array containing {2, 4, 6, 1, 2, 3, 4, 5}.*/

import java.beans.PropertyEditorManager;

public class append {
    public static void main(String[] args) {
        int[] list1 ={1,3,2};
        int[] list2 ={5,2,9,5,1};
        int resultLenght = (list1.length + list2.length);
        int[] listResult =new int[resultLenght];
        System.arraycopy(append(list1,list2),0,listResult,0,resultLenght);
        for(int i=0;i<listResult.length;i++){
            System.out.println(listResult[i]);
        }
    }

    public static int[] append(int[] list1,int[] list2){
        int[] resultArray = new int[(list1.length+list2.length)];
        int list2Count =0;
        for(int i=0;i<resultArray.length;i++){

            if(i<list1.length){
                resultArray[i] = list1[i];
            }else{
                resultArray[i] = list2[list2Count];
                list2Count++;
            }
        }

        return resultArray;
    }
}
