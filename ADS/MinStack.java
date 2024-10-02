public class public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto the stack
    public void push(int value) {
        mainStack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    // Pop element from the stack
    public int pop() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int value = mainStack.pop();
        if (value == minStack.peek()) {
            minStack.pop();
        }
        return value;
    }

    // Get the minimum element
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        // Test Case 1
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        System.out.println("Min = " + minStack.getMin());

        // Test Case 2
        minStack = new MinStack();
        minStack.push(10);
        minStack.push(8);
        minStack.push(6);
        minStack.push(12);
        System.out.println("Min = " + minStack.getMin());
    }
}

 

