package Arrays;

public class percentEven {

    /*Write a method called percentEven that accepts an array of
    integers as a parameter and returns the percentage of even numbers
     in the array as a real number. For example, if the array stores
      the elements {6, 2, 9, 11, 3}, then your method should return
      40.0. If the array contains no even elements or no elements at
       all, return 0.0.*/
    public static void main(String[] args) {
        int[] array = {6,2,9,11,3};
        System.out.println(percentEven(array));
    }

    public static double percentEven(int[] array){
        double percent =0.0;
        double sum=0.0;

        for(int i= array.length-1;i>=0;i--){
            if(array[i]%2 ==0){
                sum +=1;
            }
        }
        System.out.println(sum);

        return (sum/ array.length)*100 ;
    }
}
