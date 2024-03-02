package dataStructures;

public class LinkedLists2D {
    static Node head;
    static int listSize = 1;

    static void pushFront(int val) {
        Node newNode = new Node(val);
        newNode.prev = null;
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        listSize++;
    }

    static void pushBack(int val) {
        Node newNode = new Node(val);

        Node last = head;
        newNode.next = null;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last.next != null)
            last = last.next;
        last.next = newNode;
        newNode.prev = last;
    }

    static void insertAfter(Node prevNode, int val) {
        Node newNode = new Node(val);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        if (newNode.next != null)
            newNode.next.prev = newNode;
        listSize++;
    }

    static void insertBefore(Node nextNode, int val) {
        if (nextNode == null) {
            System.out.println(
                    "The given next node cannot be NULL ");
            return;
        }
        Node newNode = new Node(val);
        newNode.prev = nextNode.prev;
        nextNode.prev = newNode;
        newNode.next = nextNode;
        if (newNode.prev != null)
            newNode.prev.next = newNode;
        else
            head = newNode;
    }

    public static void populate() {

        pushFront(1);
        pushFront(2);
        pushFront(3);
        pushFront(4);
        pushFront(5);
        pushBack(12);
    }

    public static void main(String[] args) {
        if (args.length == 0)
            populate();
        else {
            head = new Node(Integer.parseInt(args[0]));
            for (int i = 1; i < args.length; i++) {
                pushBack(Integer.parseInt(args[i]));
            }

        }
        System.out.println(head);
    }
}

class Node {

    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        String str = "Node [\n";
        Node curr = this;
        while (true) {
            str += "   " + Integer.toString(curr.data) + ",\n";
            curr = curr.next;
            if (curr.next == null) {
                str += "   " + Integer.toString(curr.data) + ",\n";
                break;
            }
        }
        str += "]";
        return str;
    }

}
