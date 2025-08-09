import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps { // Unordered
    public static void main(String[] args) {
        // country (key) , population(val)
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        map.put("Brazil", 69);

        map.put("China", 180); // it will update the value because key already exists.

        // print map
        System.out.println(map);

        if (map.containsKey("India")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key does'nt exist");
        }

        // deletion
        map.remove("China");

        // gey value by key
        System.out.println(map.get("India")); // exist
        System.out.println(map.get("UK")); // does'nt exist (output will be NULL)

        // for loop example
        // int arr[] = { 11, 22, 33, 44 };
        // for (int val : arr) {
        // System.out.print(val + " ");
        // }
        // System.out.println();

        // iteration on Map
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "keyy");
            System.out.println(e.getValue());
        }

        // get only key
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
