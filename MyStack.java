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
    
    public void push(int element) {
        if (!isFull()) {
            stack[size] = element;
            size++;
            top++;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
    
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
    
    public int top() {
        return top;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isFull() {
        if (size == stack.length) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                str += stack[i] + ", ";
            }
            else {
                str += stack[i] + "]";
            }
        }
        return str;
    }
}
