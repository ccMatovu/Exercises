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
