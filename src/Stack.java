public class Stack {
    private int array[];
    private int top;
    private int capacity;

    Stack(int capacity) {
        this.array = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public void push(int item) {
        array[++top] = item;
    }

    public int pop() {
        return array[top--];
    }

    public int peek() {
        return array[top];
    }

    public static void main(String[] args) {

    }
}
