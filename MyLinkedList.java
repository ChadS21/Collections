import java.util.NoSuchElementException;
/**
 * My version of a Linked List data structure
 *
 * @author Chad Sawyer
 * @version 10/24/2023
 */
public class MyLinkedList<E extends Comparable<E>> 
{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    /**
     * Constructor for objects of class LinkedList
     */
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    /**
     * Adds a node at an index of the list. If index out of bounds, throws exception.
     *
     * @param  index index to add element
     * @param  element element to be added
     * @return    void
     */
    public void add(int index, E element) throws NoSuchElementException {
        if (index > size || index < 0) {
            throw new NoSuchElementException();
        }
        
        if (index == size)
        {
            add(element);
        } else if (index == 0)
        {
            addHead(element);
        } else {
            Node<E> currNode = head;
            
            for (int i = 0; i < index - 1; i++)
            {
                currNode = currNode.getNext();
            }
            Node<E> newNode = new Node<E>(element);
            newNode.setNext(currNode.getNext());
            currNode.setNext(newNode);
        }
        size++;
    }
    
    /**
     * If there is a head, inserts a new Node after the final Node in the Linked List.
     * Otherwise, call addHead(data).
     *
     * @param  data  the element contained by the new Node added
     * @return    void
     */
    public void add(E data) {
        if (head == null) {
            addHead(data);
        } else {
            Node<E> newNode = new Node<E>(data);
            tail.setNext(newNode); 
            tail = newNode;
            size++;
        }
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
            tail = newNode;
            size++;
        } else {
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }
    
    /**
     * Sets the data at index of the list to element. 
     * If index out of bounds, throws exception.
     *
     * @param  index index to set element
     * @param  element element to be set
     * @return    void
     */
    public void set(int index, E element) throws NoSuchElementException {
        if (index >= size || index < 0) {
            throw new NoSuchElementException();
        }
        
        if (index == size - 1) {
            tail.setData(element);
        } else if (index == 0) {
            head.setData(element);
        } else {
            Node<E> newNode = new Node<E>(element);
            Node<E> currNode = head;
            
            for (int i = 0; i < index - 1; i++) {
                currNode = currNode.getNext();
            }
            newNode.setNext(currNode.getNext().getNext());
            currNode.setNext(newNode);
        }
    }
    
    /**
     * Inserts new Node to its correct place in a sorted list based on Node's data.
     *
     * @param  element element to be added
     * @return    void
     */
    public void insertSorted(E element) {
        Node insert = new Node(element);
        Node currNode = head;
        
        if (insert.getData().compareTo(currNode.getData()) < 0) {
            addHead(element);
            return;
        }
        currNode = currNode.getNext();
        Node prevNode = head;
        
        for (int i = 1; i < size - 1; i++) {
            if (insert.getData().compareTo(currNode.getData()) < 0) {
                prevNode.setNext(insert);
                insert.setNext(currNode);
                size++;
                return;
            } else if (insert.getData().compareTo(currNode.getData()) > 0) {
                prevNode = currNode;
                currNode = currNode.getNext();
            }
        }
        add(element);
    }
    
    /**
     * Returns the Linked List's first Node's data
     *
     * @return    the first Node in the Linked List
     */
    public E getHead() {
        return head.getData();
    }
    
    /**
     * Returns the data of the Node at the given index.
     * If index out of bounds, throws exception.
     *
     * @param  index index of element being returned
     * @return  data of the Node at index
     */
    public E get(int index) throws NoSuchElementException {
        if (index >= size || index < 0) {
            throw new NoSuchElementException();
        }
        
        if (index == size) {
            return tail.getData();
        } else if (index == 0) {
            return head.getData();
        } else {
            Node<E> currNode = head;
            
            for (int i = 0; i < index; i++) {
                currNode = currNode.getNext();
            }
            return currNode.getData();
        }
    }
    
    /**
     * Removes the Node at index and returns its data.
     * If index out of bounds, throws exception.
     *
     * @param  index index of Node being removed
     * @return   data of the Node removed
     */
    public E remove(int index) throws NoSuchElementException {
        if (index >= size || index < 0) {
            throw new NoSuchElementException();
        }
        
        if (index == 0){
            return removeHead();
        } else if (index == size - 1){
            Node<E> currNode = head;
            Node<E> remove = tail;
            
            for (int i = 0; i < index - 1; i++) {
                currNode = currNode.getNext();
            }
            currNode.setNext(null);
            tail = currNode;
            return remove.getData();
        } else {
            Node<E> currNode = head;
            
            for (int i = 0; i < index - 1; i++) {
                currNode = currNode.getNext();
            }
            Node<E> remove = currNode.getNext();
            currNode.setNext(currNode.getNext().getNext());
            return remove.getData();
        }
    }
    
    /**
     * If the Linked List contains Nodes, removes the first Node in the list
     *
     * @return    void
     */
    public E removeHead() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException();
        }
        
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
        String str = "";
        Node<E> currNode = head;
        
        while (currNode != null) {
            str += currNode.getData();
            
            if (currNode.getNext() != null) {
                str += ", ";
            }
            currNode = currNode.getNext();
        }
        return str;
    }
}
