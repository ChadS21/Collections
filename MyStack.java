import java.util.EmptyStackException;
/**
 * My version of a Stack Abstract Data Type
 * 
 * @author Chad Sawyer
 * @version 9/26/2023
 */
public class MyStack<E>
{
    private E[] stack;
    private int size = 0;
    private int top = -1;
    
    /**
     * Constructor for objects of class MyStack
     */
    public MyStack() {
        stack = (E[]) new Object[10];
    }
    
    /**
     * Adds an element to the top of the stack
     *
     * @param  element  an element to be added to the stack
     * @return    void
     */
    public void push(E element) {
        if (!isFull()) {
            stack[size] = element;
            size++;
            top++;
        }
        else {
            System.out.println(stack[-1]); //Out of bounds error if full
        }
    }
    
    /**
     * Removes the element at the top of the stack
     *
     * @return    the element removed
     */
    public E pop() throws EmptyStackException {
        if (size == 0) {
            throw new EmptyStackException();
        }
        else {
            E pop = stack[top];
            size--;
            top--; //Changes index from which array starts to be viewed
            return pop;
        }
    }
    
    /**
     * Checks if the stack contains any elements
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
     * Gives the element at the top of the stack
     *
     * @return    the last element added to the stack
     */
    public E top() {
        return stack[top];
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
        if (size == stack.length) {
            return true;
        }
        return false;
    }
    
    /**
     * Prints the elements in the stack starting from the top
     *
     * @return    a formatted version of the queue
     */
    public String toString() {
        String str = "[";
        for (int i = top; i >= 0; i--) {
            if (i > 0) {
                str += stack[i] + ", ";
            }
            else {
                str += stack[i];
            }
        }
        str += "]";
        return str;
    }
}
