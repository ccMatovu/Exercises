import java.util.*;

public class MaxLenght {
    public static void main(String[] args) {
        Set<String> list = new HashSet<String>();
        list.addAll(Arrays.asList("asdf","gii","alsfdasd"));
        int len = maxLength(list);
        System.out.println(len);

    }
    public static int maxLength(Set<String> set) {
        int max = 0;
        Iterator<String> i = set.iterator();

        while (i.hasNext()) {
            String word = i.next();
            if (word.length() > max) {
                max = word.length();
            }
        }

        return max;
    }
}
