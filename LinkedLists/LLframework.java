import java.util.LinkedList;

public class LLframework {

  

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");

        list.addLast("linkedList");

        list.addFirst("This");

        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) { // travers
            System.out.print(list.get(i) + " -> ");
        }
        System.out.print("NULL");

        System.out.println();

        list.remove(2);
        list.removeFirst();
        list.removeLast();
        list.removeLast();
        System.out.println(list);

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println(list);

    }
}
