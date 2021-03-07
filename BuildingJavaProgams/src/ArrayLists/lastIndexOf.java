public class lastIndexOf {
    /*Write a method named lastIndexOf that accepts an array of integers
    and an integer value as its parameters and returns the last index at
    which the value occurs in the array. The method should return -1 if the
     value is not found. For example, in the list containing {74, 85, 102,
     99, 101, 85, 56}, the last index of the value 85 is 5.*/

    public static void main(String[] args) {

        int[] array = {74, 85, 102, 99, 101, 85, 56};

        int result = lastIndexOf(array,85);
        System.out.println(result);
    }
  public static int lastIndexOf(int[] array, int value){
        int index = -1;

        for(int i=(array.length)-1;i>1 ;i--){

            if(array[i] == value){
                index = i;

                i=-1;
            }

        }
        return index;
  }

}
