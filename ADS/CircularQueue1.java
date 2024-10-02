public class CircularQueue1 {
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        queue = new int[capacity];
        front = rear = size = 0;
        this.capacity = capacity;
    }
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = element;
        rear = (rear + 1) % capacity;
        size++;
		{
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = queue[front];
        front = (front + 1) % capacity;
        size--;
        return temp;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public int size() {
        return size;
    }
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue = [");
        int tempFront = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queue[tempFront]);
            tempFront = (tempFront + 1) % capacity;
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        CircularQueue queue1 = new CircularQueue(5);
        queue1.enqueue(4);
        queue1.enqueue(5);
        queue1.enqueue(6);
        queue1.enqueue(7);
        queue1.dequeue();
        queue1.enqueue(8);
        queue1.printQueue();
        CircularQueue queue2 = new CircularQueue(5);
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        queue2.enqueue(4);
        queue2.dequeue();
        queue2.dequeue();
        queue2.enqueue(5);
        queue2.printQueue();
    }
}

