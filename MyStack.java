public class MyStack
{
    private int[] stack;
    private int size = 0;
    private int top = -1;
    
    /**
     * Constructor for objects of class MyStack
     */
    public MyStack() {
        stack = new int[10];
    }
    
    /**
     * Adds an integer to the top of the stack
     *
     * @param  element  an integer to be added to the stack
     * @return    void
     */
    public void push(int element) {
        if (!isFull()) {
            stack[size] = element;
            size++;
            top++;
        }
    }
    
    /**
     * Removes the integer at the top of the stack
     *
     * @return    the integer removed
     */
    public int pop() {
        if (!isEmpty()) {
            int pop = stack[top];
            size--;
            top--;
            return pop;
        }
        return -1;
    }
    
    /**
     * Checks if the stack contains any values
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
     * Gives the value at the top of the stack
     *
     * @return    the last value added to the stack
     */
    public int top() {
        return top;
    }
    
    /**
     * Gives the number of values in the stack
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
     * Prints the values in the stack starting from the top
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
                str += stack[i] + "]";
            }
        }
        return str;
    }
}
