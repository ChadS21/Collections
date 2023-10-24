
/**
 * Write a description of class OldLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OldLinkedList<E extends Comparable<E>>
{
    private Node<E> head;
    private int size;

    /**
     * Constructor for objects of class OldLinkedList
     */
    public OldLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * If empty, sets the first Node in the list, otherwise, inserts a Node before
     * the initial first Node
     *
     * @param  data  the element contained by the new head Node
     * @return    void
     */
    public void addHead(E data) {
        Node<E> newNode = new Node<E>(data);
        
        if (head == null) {
            head = newNode;
            size++;
        } else {
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }
    
    /**
     * If there is a head, inserts a new Node after the final Node in the Linked List
     *
     * @param  data  the element contained by the new Node added
     * @return    void
     */
    public void addTail(E data) {
        if (head == null) {
            addHead(data);
        } else {
            Node<E> newNode = new Node<E>(data);
            Node<E> currNode = head;
            
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(newNode);
            size++;
        }
    }
    
    /**
     * Returns the Linked List's first Node
     *
     * @return    the first Node in the Linked List
     */
    public E getHead() {
        return head.getData();
    }
    
    /**
     * if the Linked List contains Nodes, removes the first Node in the list
     *
     * @return    void
     */
    public E removeHead() {
        E removed = getHead();
        if (!isEmpty()) {
            head = head.getNext();
            size--;
        }
        return removed;
    }
    
    /**
     * Returns if the Linked List contains Nodes or not
     *
     * @return    If the list contains Nodes or not
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Returns the Linked List's size
     *
     * @return    the size of the Linked List
     */
    public int size() {
        return size;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString() {
        String str = "[";
        Node<E> currNode = head;
        
        while (currNode != null) {
            str += currNode.getData();
            
            if (currNode.getNext() != null) {
                str += ", ";
            }
            currNode = currNode.getNext();
        }
        str += "]";
        return str;
    }
}
