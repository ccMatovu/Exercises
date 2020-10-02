/*
  Write a method writeChars that accepts an integer parameter n
  and that prints out n characters as follows.
  The middle character of the output should always be an asterisk ("*").
  If you are asked to write out an even number of characters,
  then there will be two asterisks in the middle ("**").
  Before the asterisk(s) you should write out less-than characters ("<").
  After the asterisk(s) you should write out greater-than characters (">").
  e.g.
    writeChars(1);	*
    writeChars(2);	**
    writeChars(3);	<*>
    writeChars(4);	<**>
    writeChars(5);	<<*>>
  */

public class WriteChars {
    public static void main(String[] args) {
        writeChars(5);
    }

    private static void writeChars(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("*");
        } else if (n == 2) {
            System.out.print("**");
        } else {
            System.out.print("<");
            writeChars(n - 2);
            System.out.print(">");
    }
}
