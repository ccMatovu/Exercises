import javax.imageio.ImageReader;
import java.util.ArrayList;
import java.util.Arrays;

public class MarkLength4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("four", "for ", "all "));
        markLength4(list);
        System.out.println(list);
    }

    private static void markLength4(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
            }
        }
    }
}
