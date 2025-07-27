import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // search
        if (set.contains(1)) {
            System.out.println("Contains 1");
        }
        if (!set.contains(5)) {
            System.out.println("Does not contain 5");
        }

        // delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("1 was removed");
        }

        // size
        System.out.println("Size of this set is " + set.size());

        // print all elements
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();
        while ( it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
