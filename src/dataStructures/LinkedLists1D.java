package dataStructures;


public class LinkedLists1D {
    static Node head;
    static int listSize;

    static void pushFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        listSize += 1;
    }

    static void pushBack(int data) {
        Node newNode = new Node(data);
        Node currNode = head;
        for (int i = 1; i < listSize; i++) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        listSize += 1;
    }

    static void pushAt(int index, int data) {
        Node toUpdate = head;
        for (int i = 0; i < index; i++) {
            toUpdate = toUpdate.next;
        }
        Node newNode = new Node(toUpdate.data);
        newNode.next = toUpdate.next;
        toUpdate.data = data;
        toUpdate.next = newNode;

        listSize += 1;

    }

    public static void populate() {
        head = new Node(1);
        pushFront(2);
        pushBack(3);
        pushAt(1, 4);
        pushBack(45);
        pushFront(12);
    }

    public static void main(String[] args) {
        listSize = 1;

        if (args.length == 0)
            populate();
        else {
            head = new Node(Integer.parseInt(args[0]));
            for (int i = 1; i < args.length; i++) {
                pushBack(Integer.parseInt(args[i]));
            }

        }

        Node curr = head;
        for (int i = 0; i < listSize; i++) {
            System.out.println(curr.data);
            curr = curr.next;
        }

    }
}
class Node {

    int data;
    Node next;
    /*
     * A node representing an one-dimensional Linked List element.
     * 
     * @param data: the data this node is holding
     * 
     * @param next: the sequentially following Node
     */

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + "]";
    }
}
