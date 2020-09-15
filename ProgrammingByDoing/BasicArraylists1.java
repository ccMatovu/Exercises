import java.util.ArrayList;

public class BasicArraylists1 {
    public static void main(String[] args) {
        ArrayList<Integer> copies = new ArrayList<>();

        for(int i=0;i<10;i++){
            copies.add(i,-113);
            System.out.println("Slot "+i+" contains a "+copies.get(i));
        }
    }
}
