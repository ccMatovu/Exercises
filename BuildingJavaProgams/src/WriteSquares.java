


public class WriteSquares {
    public static void main(String[] args) {
        writeSquares(5);
    }

    static void writeSquares(int n) throws IllegalArgumentException {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        if (n == 1) {
            System.out.print("1");
        } else if (n % 2 == 0) {
            writeSquares(n - 1);
            System.out.printf(", %d", n * n);
        } else {
            System.out.printf("%d, ", n * n);
            writeSquares(n - 1);
        }
    }
}
