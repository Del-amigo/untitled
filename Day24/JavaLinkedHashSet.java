package Day24;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class JavaLinkedHashSet {

    public static void main(String[] args) {
//        Set<Character> set = new LinkedHashSet<>();

        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        System.out.println("HashSet: " + set);


        LinkedHashSet<String> set1 = new LinkedHashSet();
        set1.add("One");
        set1.add("Two");
        set1.add("Three");
        set1.add("Four");
        set1.add("Five");
        System.out.println("LinkedHashSet: " + set1);

    }
}