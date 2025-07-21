import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queueFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();

        q.add(6);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
