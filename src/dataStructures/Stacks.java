package dataStructures;

class Stack {
    static final int MAX = 100;
    static int top = -1;
    static int[] stackData = new int[MAX];

    boolean push(int data) {
        if (top >= MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        stackData[++top] = data;
        return true;
    }

    int pop(int data) {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        top--;
        return stackData[top + 1];
    }

    int peek(int index) {
        if (index > top) {
            System.out.println("Out of index");
            return 0;
        }
        return stackData[index];
    }

    void print() {
        for (int d : stackData) {
            System.out.println(d);
        }
    }

}

public class Stacks {
    public static void main(String[] args) {

    }
}
