public class XsAndYs {
    public static void main(String[] args) {
        System.out.println("x     y");
        System.out.println("---------------");
        double y;
        for (double i = -10.0; i <= 10.0; i += 0.5) {
            y = i*i;
            System.out.println(i+"   "+y);
        }
    }
}
