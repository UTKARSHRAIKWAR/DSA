import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(); // for int
        ArrayList<String> list2 = new ArrayList<>(); // for string

        // add elements
        list1.add(0);
        list1.add(5);
        list1.add(6);

        System.out.println(list1);

        // get elements
        int el_1 = list1.get(0); // by index number
        int el_2 = list1.get(2);

        System.out.println(el_1 + " and " + el_2);

        // add element in bet - (index)
        list1.add(1, 8);
        System.out.println(list1);

        // set elements
        list1.set(0, 9);
        System.out.println(list1);

        // del el
        list1.remove(0);
        System.out.println(list1);

        // size
        int size = list1.size();
        System.out.println(size);

        // loop
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        // sort
        Collections.sort(list1);
        System.out.println(list1);
    }
}
