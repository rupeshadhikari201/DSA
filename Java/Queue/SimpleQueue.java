package Java.Queue;

public class SimpleQueue {

    private int[] quqeue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public SimpleQueue(int size) {

        quqeue = new int[size];
        front = 0;
        rear = -1;
        capacity = size;
        count = 0;
    }

    public static void main(String[] args) {

        SimpleQueue sq = new SimpleQueue(10);

        sq.enque(10);
        sq.enque(20);
        System.out.println(sq.size());
        System.out.println(sq.peek());
        System.out.println(sq.peek());

    }

    // function to remove front element from the queue
    public void enque(int data) {

        // check if queue is overflow
        if (count == capacity) {
            System.out.println("Overflow");
            System.exit(1);
        }

        rear = (rear + 1) % capacity;
        quqeue[rear] = data;
        count++;

    }

    // function to remove front element from the queue
    public void deque() {

        // check underflow
        if (count == 0) {
            System.out.println("There is no element to deque. Underflow");
        }

        System.out.println("Deleting" + quqeue[front]);
        front = front + 1;
        count--;

    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Underflow");
            System.exit(1);
        }

        return quqeue[front];

    }

    // size
    public int size() {
        return count;
    }

    // isEmpty()
    public boolean isEmpty() {
        return count == 0;
    }

}
