
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node<E extends Comparable<E>>
{
    private E data;
    private Node<E> next;
    private Node<E> prev;

    /**
     * Constructor for objects of class Node
     */
    public Node(E data)
    {
        this.data = data;
        next = null;
        prev = null;
    }

    /**
     * Returns the element the Node contains
     *
     * @return    data the element the Node contains
     */
    public E getData() {
        return data;
    }
    
    /**
     * Sets the data the Node contains to the parameter
     *
     * @param  data  the new value of the Node's element
     * @return    void
     */
    public void setData(E data) {
        this.data = data;
    }
    
    /**
     * Returns the next Node in the Linked List
     *
     * @return    next Node in the Linked List
     */
    public Node<E> getNext() {
        return next;
    }
    
    /**
     * Sets the next Node in a Linked List
     *
     * @param  next  the Node to be set
     * @return    void
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }
    
    /**
     * Returns the previous Node in the Linked List
     *
     * @return    previous Node in the Linked List
     */
    public Node<E> getPrev() {
        return prev;
    }
    
    /**
     * Sets the previous Node in a Linked List
     *
     * @param  prev  the Node to be set
     * @return    void
     */
    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }
}
