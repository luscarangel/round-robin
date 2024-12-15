public class Queue {
    
    Process[] queue;
    int capacity;
    int end;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = new Process[capacity];
    }

    public void enqueue(Process process) {
        if (!this.isFull()) {
            this.queue[this.end] = process;
            this.end++;
        } else {
            System.out.println("The queue is full, cannot add a new process");
        }
    }

    public Process dequeue() {
        if (!this.isEmpty()) {
            Process process = this.queue[0];

            for (int i = 0; i < this.capacity - 1; i++) {
                this.queue[i] = this.queue[i + 1];
            }
            
            this.end--;
            this.queue[this.end] = null;

            return process;
        }

        System.out.println("The queue is empty, cannot dequeue");
        return null;
    }


    public boolean isEmpty() {
        return this.end == 0;
    }

    private boolean isFull() {
        return this.end == this.capacity;
    }
}
