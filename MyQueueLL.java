/**
 * My version of a Queue Abstract Data Type
 * 
 * @author Chad Sawyer
 * @version 9/26/2023
 */
public class MyQueueLL<E>
{
    private int[] queue;
    private int front;
    private int size = 0;
    
    /**
     * Constructor for objects of class MyQueue
     */
    public MyQueueLL() {
        queue = new int[10];
        front = queue.length; //Sets front out of bounds to be shifted in enqueue 
    }
    
    /**
     * Adds an element to the back of the queue
     *
     * @param  element  an element to be added to the queue
     * @return    void
     */
    public void enqueue(int element) {
        if (!isFull())
        {
            if (isEmpty()) {
                queue[queue.length - 1] = element; //Adds to end if empty
            }
            else {
                for (int i = front; i < queue.length; i++) {
                    queue[i - 1] = queue[i]; //Shifts previous elements down
                    queue[i] = element;
                }
            }
            front--;
            size++;
        }
        else {
            System.out.println(queue[-1]); //Out of bounds error if full
        }
    }
    
    /**
     * Removes the element at the front of the queue
     *
     * @return    the element removed
     */
    public int dequeue() {
        if (!isEmpty()) {
            int dequeue = queue[front];
            size--;
            front++; //Shifts front back to element after dequeued element
            return dequeue;
        }
        return queue[-1]; //Out of bounds error if empty
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
    public int front() {
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
                str += queue[i];
            }
        }
        str += "]";
        return str;
    }
}
