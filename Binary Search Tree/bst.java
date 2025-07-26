public class bst {
    static class Node { // Node initialization
        int data;
        Node left;
        Node right;

        Node(int data) { // constructor
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) { // insertion of values in tree
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root) { // inOrder traversal
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int target) { // searching in BST
        if (root == null) {
            return false;
        }

        if (root.data > target) { // for left subtree
            return search(root.left, target);
        } else if (root.data == target) {
            return true;
        } else { // for right subTree
            return search(root.right, target);
        }
    }

    // deletion
    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        }

        else { // case -> 1 (No Child)
            if (root.left == null && root.right == null) {
                return null;
            }

            // case -> 2 (One Child)
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case -> 3 (Two child)
            Node IS = inOrderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public static Node inOrderSuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if (search(root, 4)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        delete(root, 4);
        inOrder(root);
    }
}
