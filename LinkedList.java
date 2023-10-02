
/**
 * Write a description of class LinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedList<E>
{
    private Node head;
    private int size = 0;

    /**
     * Constructor for objects of class LinkedList
     */
    public LinkedList() {
        head = null;
    }

    /**
     * If empty, sets the first Node in the list, otherwise, inserts a Node before
     * the initial first Node
     *
     * @param  data  the element contained by the new head Node
     * @return    void
     */
    public void addHead(E data) {
        Node newNode = new Node(data);
        
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
            Node newNode = new Node(data);
            Node currNode = head;
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
    public Node getHead() {
        return head;
    }
    
    /**
     * if the Linked List contains Nodes, removes the first Node in the list
     *
     * @return    void
     */
    public void removeHead() {
        if (!isEmpty()) {
            Node newHead = head.getNext();
            head.setNext(head.getNext().getNext());
            head = newHead;
            size--;
        }
    }
    
    /**
     * Returns if the Linked List contains Nodes or not
     *
     * @return    If the list contains Nodes or not
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
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
        Node currNode = head;
        
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
