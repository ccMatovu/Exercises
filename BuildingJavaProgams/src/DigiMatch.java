public class DigiMatch {
    public static void main(String[] args) {
       int digi= digitMatch(5,3);
        System.out.println("digiMatch = "+digi);

    }
    static int digitMatch(int x, int y) throws IllegalArgumentException {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        } else {
            int cur = x % 10 == y % 10 ? 1 : 0;
            x /= 10;
            y /= 10;
            if (x == 0 || y == 0) {
                return cur;
            } else {
                return cur + digitMatch(x, y);
            }
        }
    }
}
