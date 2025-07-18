public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    // print list
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void delFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void delLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nexNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nexNode;
        }
        head.next = null;
        head = prevNode;

    }

    public Node recursiveReverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("name");
        list.addFirst("is");
        list.printList();

        list.addLast("variable");
        list.addLast("variable2");
        list.printList();

        list.delFirst();
        list.printList();

        list.delLast();
        list.printList();

        System.out.println(list.getSize());

        list.addLast("hey");
        System.out.println(list.getSize());

        list.reverseIterate();
        list.printList();

        list.head = list.recursiveReverse(list.head);
        list.printList();
    }
}
