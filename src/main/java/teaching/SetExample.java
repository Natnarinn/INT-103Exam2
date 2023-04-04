package teaching;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("durian", "banana", "orange", "apple", "banana"));

        Set<String> hashSet = new HashSet<>(fruits);
        Set<String> linkedHashSet = new LinkedHashSet<>(fruits);
        Set<String> treeSet = new TreeSet<>(fruits);

        System.out.printf("HashSet: %s%n", hashSet);
        System.out.printf("LinkedHashSet: %s%n", linkedHashSet);
        System.out.printf("TreeSet: %s%n", treeSet);
    }
}
