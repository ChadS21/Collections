/**
 * Write a description of class BinarySearchTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTree<E extends Comparable<E>> 
{
    private BinaryTreeNode<E> root;
    private int size;

    /**
     * Constructor for objects of class BinarySearchTree
     */
    public BinarySearchTree()
    {
        root = null;
        size = 0;
    }

    /**
     * If the tree is empty, sets the root to the new node, otherwise calls
     * the Binary Tree Node insert method and increments size
     *
     * @param  element the data to be added
     */
    public void insert(E element)
    {
        if (isEmpty()) {
            root = new BinaryTreeNode<E>(element);
        }
        else {
            root.insert(element);
        }
        size++;
    }
    
    /**
     * If the tree is empty, returns null, otherwise calls
     * the Binary Tree Node search method
     *
     * @param  element the data to be searched
     * @return the element searched if found
     */
    public E search(E element)
    {
        if (isEmpty()) {
            return null;
        }
        return root.search(element);
    }
    
    /**
     * If the element is not found, returns null, otherwise calls the Node
     * remove method and subtracts size
     *
     * @param  element the data to be removed
     * @return the deleted element
     */
    public E remove(E element) {
        if (search(element) == null) {
            return null;
        }
        root.remove(element);
        size--;
        return element;
    }
    
    /**
     * If there is a minimum value, calls remove on this value
     *
     * @return the deleted element
     */
    public E removeMin() {
        if (getMin() == null) {
            return null;
        }
        return remove(getMin());
    }
    
    /**
     * If there is a maximum value, calls remove on this value
     *
     * @return the deleted element
     */
    public E removeMax() {
        if (getMax() == null) {
            return null;
        }
        return remove(getMax());
    }
    
    /**
     * If there is a minimum value, returns it
     *
     * @return the tree's smallest value
     */
    public E getMin() {
        if (isEmpty()) {
            return null;
        } else {
            return root.getMin();
        }
    }
    
    /**
     * If there is a maximum value, returns it
     *
     * @return the tree's largest value
     */
    public E getMax() {
        if (isEmpty()) {
            return null;
        } else {
            return root.getMax();
        }
    }
    
    public void printTree()
    {
        root.printTree(1);
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public int size()
    {
        return size;
    }
    
    public int getDepth() {
        return root.getDepth();
    }
    
    public String toString() {
        String str = "";
        if (root != null) {
            if (root.getLeft() != null) {
                str += root.getLeft().toString() + ", ";
            }
            str += root.getData();
            if (root.getRight() != null) {
                str += ", " + root.getRight().toString();
            }
        }
        return str;
    }
}
