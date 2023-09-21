public class MyQueue
{
    private int[] queue;
    private int front;
    private int size = 0;
    
    /**
     * Constructor for objects of class MyQueue
     */
    public MyQueue() {
        queue = new int[10];
        front = queue.length;
    }
    
    /**
     * Adds an integer to the back of the queue
     *
     * @param  element  an integer to be added to the queue
     * @return    void
     */
    public void enqueue(int element) {
        if (!isFull())
        {
            if (isEmpty()) {
                queue[queue.length - 1] = element;
            }
            else {
                for (int i = front; i < queue.length; i++) {
                    queue[i - 1] = queue[i];
                    queue[i] = element;
                }
            }
            front--;
            size++;
        }
    }
    
    /**
     * Removes the integer at the front of the queue
     *
     * @return    the integer removed
     */
    public int dequeue() {
        if (!isEmpty()) {
            int dequeue = queue[front];
            size--;
            front++;
            return dequeue;
        }
        return -1;
    }
    
    /**
     * Checks if the queue contains any values
     *
     * @return    true if empty, false if not
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
    
    /**
     * Gives the value at the front of the queue
     *
     * @return    the first accesible integer in the queue
     */
    public int front() {
        return queue[front];
    }
    
    /**
     * Gives the number of accesible values in the queue
     *
     * @return    the size of the queue
     */
    public int size() {
        return size;
    }
    
    /**
     * Checks if the queue has any open spaces
     *
     * @return    true if full, false if not
     */
    public boolean isFull() {
        if (front == 0) {
            return true;
        }
        return false;
    }
    
    /**
     * Prints the values in the queue starting from the front
     *
     * @return    a formatted version of the queue
     */
    public String toString() {
        String str = "[";
        for (int i = front; i < front + size; i++) {
            if (i < front + size - 1) {
                str += queue[i] + ", ";
            }
            else {
                str += queue[i] + "]";
            }
        }
        return str;
    }
}
