package Arrays;

import org.w3c.dom.ls.LSOutput;

/*
* Write a method named longestSortedSequence that accepts an array of
* integers as a parameter and that returns the length of the longest
* sorted (nondecreasing) sequence of integers in the array.
* For example, if a variable named array stores the following values:
int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
then the call of longestSortedSequence(array) should return 4 because
* the longest sorted sequence in the array has four values in it
* (the sequence -3, 0, 14, 207). Notice that sorted means nondecreasing,
*  which means that the sequence could contain duplicates.*/
public class longestSortedSequence {
    public static void main(String[] args) {
        int[] array ={3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};

        System.out.println(longestSortedSequence(array));
    }
    public static int longestSortedSequence(int[] array){
        if(array.length ==0){
            return 0;
        }else if(array.length == 1){
            return 1;
        }
        int longest = 0;
        int sequence =1;

        for(int i=0;i<array.length-1;i++){

            if(array[i] <= array[i+1]){
                sequence +=1;
            }else{
                sequence =1;
            }

            if(sequence > longest){
                longest =sequence;
            }
        }

        return longest;
    }

}
