import java.util.ArrayList;

public class BasicArraylists0 {
    public static void main(String[] args) {
        ArrayList<Integer> copies = new ArrayList<>(10);
        copies.add(-113);
        copies.add(-113);
        copies.add(-113);
        copies.add(-113);
        copies.add(-113);
        copies.add(-113);
        copies.add(-113);
        copies.add(-113);
        copies.add(-113);
        copies.add(-113);

        System.out.println("Slot 0 contains a "+copies.get(0));
        System.out.println("Slot 1 contains a "+copies.get(1));
        System.out.println("Slot 2 contains a "+copies.get(2));
        System.out.println("Slot 3 contains a "+copies.get(3));
        System.out.println("Slot 4 contains a "+copies.get(4)) ;
        System.out.println("Slot 5 contains a "+copies.get(5));
        System.out.println("Slot 6 contains a "+copies.get(6));
        System.out.println("Slot 7 contains a "+copies.get(7));
        System.out.println("Slot 8 contains a "+copies.get(8));
        System.out.println("Slot 9 contains a "+copies.get(9));

    }
}
