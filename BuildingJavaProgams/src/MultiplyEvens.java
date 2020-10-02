public class MultiplyEvens {
    public static void main(String[] args) {
        int product = multiplyEvens(5);
    }

    private static int multiplyEvens(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1) {
            return 2;
        }
        return 2 * n * multiplyEvens(n - 1);

    }
}
