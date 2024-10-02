public class QueueUsingTwoStacks {
    private Stack<Integer> stack1; // for enqueue
    private Stack<Integer> stack2; // for dequeue

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue element
    public void enqueue(int element) {
        stack1.push(element);
    }

    // Dequeue element
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        // Move elements from stack1 to stack2 if stack2 is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return stack1.size() + stack2.size();
    }

    // Print queue elements
    public void printQueue() {
        if (!stack2.isEmpty()) {
            System.out.print("Queue = [");
            Stack<Integer> temp = new Stack<>();
            while (!stack2.isEmpty()) {
                int element = stack2.pop();
                System.out.print(element + " ");
                temp.push(element);
            }
            while (!temp.isEmpty()) {
                stack2.push(temp.pop());
            }
            System.out.println("]");
        } else {
            System.out.print("Queue = [");
            Stack<Integer> temp = new Stack<>();
            while (!stack1.isEmpty()) {
                int element = stack1.pop();
                System.out.print(element + " ");
                temp.push(element);
            }
            while (!temp.isEmpty()) {
                stack1.push(temp.pop());
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        // Test Case 1
        queue.enqueue(3);
        queue.enqueue(7);
        System.out.println("Dequeued element = " + queue.dequeue());
        queue.printQueue();

        // Test Case 2
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Dequeued element = " + queue.dequeue());
        System.out.println("Dequeued element = " + queue.dequeue());
        queue.printQueue();
    }
}