package dataStructures;

class Stack {
    static final int MAX = 100;
    static int top = -1;
    static int[] stackData = new int[MAX];

    boolean isEmpty(){
        return top>=0;
    }

    boolean isFull(){
        return top==MAX-1;
    }

    boolean push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return false;
        }
        stackData[++top] = data;
        return true;
    }

    int pop(int data) {
        if (isEmpty()) {
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
        if(top==-1){
            System.out.println("Stack underflow");
        }
        for(int i=0;i<top+1;i++){
            System.out.println(stackData[i]);
        }
    }

}

public class Stacks {
    public static void main(String[] args) {
        // Stack stack = new Stack();

    }
}
