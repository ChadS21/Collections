public class MyQueue<E>
{
    private E[] queue;
    private int front;
    private int size = 0;
    
    /**
     * Constructor for objects of class MyQueue
     */
    public MyQueue() {
        queue = (E[]) new Object[10];
        front = queue.length;
    }
    
    /**
     * Adds an element to the back of the queue
     *
     * @param  element  an element to be added to the queue
     * @return    void
     */
    public void enqueue(E element) {
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
        else {
            System.out.println(queue[-1]);
        }
    }
    
    /**
     * Removes the element at the front of the queue
     *
     * @return    the element removed
     */
    public E dequeue() {
        if (!isEmpty()) {
            E dequeue = queue[front];
            size--;
            front++;
            return dequeue;
        }
        return queue[-1];
    }
    
    /**
     * Checks if the queue contains any elements
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
     * Gives the element at the front of the queue
     *
     * @return    the first accesible element in the queue
     */
    public E front() {
        return queue[front];
    }
    
    /**
     * Gives the number of accesible elements in the queue
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
     * Prints the elements in the queue starting from the front
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
