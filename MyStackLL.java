/**
 * My version of a Stack Abstract Data Type
 * 
 * @author Chad Sawyer
 * @version 9/26/2023
 */
public class MyStackLL<E extends Comparable<E>>
{
    private LinkedList<E> stack = new LinkedList<E>();
    private int size = 0;
    
    /**
     * Adds an element to the top of the stack
     *
     * @param  element  an element to be added to the stack
     * @return    void
     */
    public void push(E element) {
        stack.addHead(element);
        size++;
    }
    
    /**
     * Removes the element at the top of the stack
     *
     * @return    the element removed
     */
    public E pop() {
        if (!isEmpty()) {
            size--;
            return stack.removeHead();
        }
        return null;
    }
    
    /**
     * Checks if the stack contains any elements
     *
     * @return    true if empty, false if not
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    /**
     * Gives the element at the top of the stack
     *
     * @return    the last element added to the stack
     */
    public E top() {
        return stack.getHead();
    }
    
    /**
     * Gives the number of elements in the stack
     *
     * @return    the size of the stack
     */
    public int size() {
        return size;
    }
    
    /**
     * Checks if the stack has any open spaces
     *
     * @return    true if full, false if not
     */
    public boolean isFull() {
        return false;
    }
    
    /**
     * Prints the elements in the stack starting from the top
     *
     * @return    a formatted version of the queue
     */
    public String toString() {
        return stack.toString();
    }
}
