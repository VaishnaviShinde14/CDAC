public class Stack13 {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }

    // Push element onto stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = element;
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Get the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    // Print stack elements
    public void printStack() {
        System.out.print("Stack = [");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]);
            if (i < top) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Test Case 1
        Stack stack1 = new Stack(5);
        stack1.push(5);
        stack1.push(3);
        stack1.push(7);
        stack1.printStack();
        System.out.println("Popped element = " + stack1.pop());
        stack1.printStack();

        // Test Case 2
        Stack stack2 = new Stack(5);
        stack2.push(10);
        stack2.push(20);
        stack2.printStack();
        System.out.println("Popped element = " + stack2.pop());
        stack2.push(15);
        stack2.printStack();
    }
}


