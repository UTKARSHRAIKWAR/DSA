public class Trie {
    static class Node {
        Node[] children;
        Boolean end;

        public Node() {
            children = new Node[26]; // a- z
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            end = false;
        }
    }

    static Node root = new Node();

    public static void insert(String words) {
        for (int i = 0; i < words.length(); i++) {
            int idx = words.charAt(i) - 'a';
            if (root.children[idx] == null) {
                // add new node
                root.children[idx] = new Node();
            }
            if (i == words.length() - 1) {
                root.children[idx].end = true;
            }
            root = root.children[idx];
        }
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any" };
    }
}