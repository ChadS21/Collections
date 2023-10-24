/**
 * My version of a Queue Abstract Data Type
 * 
 * @author Chad Sawyer
 * @version 9/26/2023
 */
public class MyQueueLL<E extends Comparable<E>>
{
    private LinkedList<E> queue = new LinkedList<E>();
    private int size = 0;
    
    /**
     * Adds an element to the back of the queue
     *
     * @param  element  an element to be added to the queue
     * @return    void
     */
    public void enqueue(E element) {
        queue.add(element);
        size++;
    }
    
    /**
     * Removes the element at the front of the queue
     *
     * @return    the element removed
     */
    public E dequeue() {
        E dequeue = front();
        queue.removeHead();
        size--;
        return dequeue;
    }
    
    /**
     * Checks if the queue contains any elements
     *
     * @return    true if empty, false if not
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    /**
     * Gives the element at the front of the queue
     *
     * @return    the first accesible element in the queue
     */
    public E front() {
        return queue.getHead();
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
     * Prints the elements in the queue starting from the front
     *
     * @return    a formatted version of the queue
     */
    public String toString() {
        return queue.toString();
    }
}
