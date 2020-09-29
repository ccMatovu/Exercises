/*
  Write a method starString that accepts an integer parameter n
  and returns a string of stars (asterisks) 2^n long (i.e., 2 to the nth power).
  You should throw an IllegalArgumentException if passed a value less than 0.
  e.g.
   starString(0);	"*"
   starString(4);	"****************"
  */
public class StarString {
    public static void main(String[] args) {
        int num = 5;
        String result = starString(num);
        System.out.println(result);
    }

    private static String starString(int num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        if (num == 0) {
            return "*";
        }
        return starString(num - 1) + starString(num - 1);
    }
}
