/*
 * Write a method writeNums that accepts an integer parameter n and prints
 * the first n integers starting with 1 in sequential order, separated by
 * commas. Your method should throw an IllegalArgumentException if passed
 * a value less than 1.
 */


public class WriteNums {
    public static void main(String[] args) {
        int num =3;
        writeNums(num);
    }

    private static void writeNums(int num) {
        if (num < 1) {
            throw new IllegalArgumentException();
        } else if (num == 1) {
            System.out.print("1");
        } else {
            writeNums(num - 1);
            System.out.print(", " + num);
        }
    }
}
