import java.util.LinkedList;

import java.util.Queue;

public class tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // preOrder traversal O(n)
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    // inOrder traversal O(n)
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int sumLefts = sumOfNodes(root.left);
        int sumRight = sumOfNodes(root.right);

        return sumLefts + sumRight + root.data;
    }

    public static int hieght(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHieght = hieght(root.left);
        int rightHieght = hieght(root.right);

        int max = Math.max(leftHieght, rightHieght) + 1;

        return max;
    }

    // diameter approach-1
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = hieght(root.left) + hieght(root.right) + 1;

        return Math.max(dia3, Math.max(dia1, dia2));
    }

    // approach-2
    static class TreeInfo {
        int ht;
        int dia;

        TreeInfo(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHT = Math.max(left.ht, right.ht) + 1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht + right.ht + 1;

        int myDia = Math.max(Math.max(dia1, dia2), dia3);

        TreeInfo myInfo = new TreeInfo(myHT, myDia);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // preOrder(root);
        // inOrder(root);
        // postOrder(root);
        // levelOrder(root);
        // System.out.println(countNodes(root));
        // System.out.println(sumOfNodes(root));
        // System.out.println(hieght(root));
        System.out.println(diameter2(root).dia);

    }
}
