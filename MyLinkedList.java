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
            Node<E> currNode = finder(index - 1);   
            Node<E> newNode = new Node<E>(element);
            size++;
            currNode.getNext().setPrev(newNode);
            newNode.setNext(currNode.getNext());
            currNode.setNext(newNode);
            newNode.setPrev(currNode);
        }
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
            size++;
            newNode.setPrev(tail);
            tail.setNext(newNode); 
            tail = newNode;
        }
    }
    
    /**
     * Calls add(E data)
     *
     * @param  data  the element contained by the new Node added
     * @return    void
     */
    public void addTail(E data) {
        add(data);
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
        size++;
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
            if (size == 2)
            {
                tail = head.getNext();
            }
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
            finder(index).setData(element);
        }
    }
    
    /**
     * Inserts new Node to its correct place in a sorted list based on Node's data.
     *
     * @param  element element to be added
     * @return    void
     */
    public void insertSorted(E element) {
        if (size == 0) {
            addHead(element);
            return;
        }
        
        Node insert = new Node(element);
        Node currNode = head;

        if (insert.getData().compareTo(currNode.getData()) < 0) {
            addHead(element);
            return;
        }
        
        currNode = head.getNext();
        
        for (int i = 1; i < size; i++) {
            if (insert.getData().compareTo(currNode.getData()) <= 0) {
                add(i, element);
                return;
            } else {
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
        if (index >= size || index < 0 || head == null) {
            throw new NoSuchElementException();
        }
        
        if (index == size - 1) {
            return tail.getData();
        } else if (index == 0) {
            return head.getData();
        } else {  
            return finder(index).getData();
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
        if (index >= size || index < 0 || (index == 0 && head == null)) {
            throw new NoSuchElementException();
        }
        
        if (index == 0){
            return removeHead();
        } else if (index == size - 1) {
            Node<E> currNode = head;
            Node<E> remove = tail;
            
            for (int i = 0; i < index - 1; i++) {
                currNode = currNode.getNext();
            }
            currNode.setNext(null);
            tail = currNode;
            size--;
            return remove.getData();
        } else {
            Node<E> currNode = head;
            
            for (int i = 0; i < index - 1; i++) {
                currNode = currNode.getNext();
            }
            Node<E> remove = currNode.getNext();
            currNode.getNext().getNext().setPrev(currNode);
            currNode.setNext(currNode.getNext().getNext());
            size--;
            return remove.getData();
        }
    }
    
    /**
     * Removes the Node containing element and returns its data.
     * If list doesn't contain element, returns null.
     *
     * @param  element element to be removed
     * @return   data of the Node removed
     */
    public E remove(E element) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(element)) {
                return remove(i);
            }
        }
        return null;
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
        if (size > 1) {            
            head = head.getNext();
            head.setPrev(null);
            size--;
            return removed;
        } else {
            head = null;
            head.setPrev(null);
            size--;
            return removed;
        }
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
    
    public Node<E> finder(int index) {
        if (index < (size / 2)) {
            Node<E> currNode = head;
            for (int i = 0; i < index; i++) {
                currNode = currNode.getNext();
            }
            return currNode;
        } else {
            Node<E> currNode = tail;
            for (int i = size - 1; i > index; i--) {
                currNode = currNode.getPrev();
            }
            return currNode;
        }
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
