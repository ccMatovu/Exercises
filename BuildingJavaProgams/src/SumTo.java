public class SumTo {
    public static void main(String[] args) {
        double sum = sumTo(5);
    }

    private static int sumTo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return (int) 0.0;
        } else {
            return (int) (1.0 / n + sumTo(n - 1));
        }
    }
}
