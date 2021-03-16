package Arrays;
/*
* Write a method named isUnique that takes an array of integers as a
* parameter and that returns a boolean value indicating whether or not
*  the values in the array are unique (true for yes, false for no).
* The values in the list are considered unique if there is no pair of
* values that are equal. For example, if a variable called list stores
*  the following values:

int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
Then the call of isUnique(list) should return true because there are
* no duplicated values in this list. If instead the list stored these
* values:*/
public class isUnique {
    public static void main(String[] args) {
        int[] array =  {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        System.out.println(isUnique(array));
    }
    public static boolean isUnique(int[] array){
        boolean unique=true;

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){

                if(array[i] == array[j]){
                    unique = false;
                }
            }
        }
        return unique;
    }
}
