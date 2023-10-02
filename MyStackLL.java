import java.util.EmptyStackException;
/**
 * My version of a Stack Abstract Data Type
 * 
 * @author Chad Sawyer
 * @version 9/26/2023
 */
public class MyStackLL<E>
{
    private LinkedList stack;
    private int elementCount = 0;
    private int top = -1;
    
    /**
     * Adds an element to the top of the stack
     *
     * @param  element  an element to be added to the stack
     * @return    void
     */
    public void push(E element) {
        
    }
    
    /**
     * Removes the element at the top of the stack
     *
     * @return    the element removed
     */
    public int pop() throws EmptyStackException {
        return 1;
    }
    
    /**
     * Checks if the stack contains any elements
     *
     * @return    true if empty, false if not
     */
    public boolean isEmpty() {
        if (elementCount == 0)
        {
            return true;
        }
        return false;
    }
    
    /**
     * Gives the element at the top of the stack
     *
     * @return    the last element added to the stack
     */
    public int top() {
        return 1;
    }
    
    /**
     * Gives the number of elements in the stack
     *
     * @return    the size of the stack
     */
    public int size() {
        return elementCount;
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
        String str = "[";
        
        return str;
    }
}
