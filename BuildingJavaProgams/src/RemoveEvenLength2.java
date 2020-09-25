import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveEvenLength2 {
    public static void main(String[] args) {
        Set<String> set =
                Stream.of("joke", "giid", "good", "power", "shit", "sex", "my", "*")
                        .collect(Collectors.toCollection(HashSet::new));
        removeEvenLength(set);
        System.out.println(set);
    }

    private static void removeEvenLength(Set<String> set) {
        Iterator<String> iterate = set.iterator();

        while (iterate.hasNext()) {
            String word = iterate.next();
            if (word.length() % 2 == 0) {
                iterate.remove();
            }
        }
    }
}
