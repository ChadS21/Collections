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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
    
    public E search(E element)
    {
        if (isEmpty()) {
            return null;
        }
        return root.search(element);
    }
    
    public E remove(E element) {
        if (search(element) == null) {
            return null;
        }
        root.remove(element);
        return element;
    }
    
    public E removeMin() {
        if (getMin() == null) {
            return null;
        }
        return remove(getMin());
    }
    
    public E removeMax() {
        if (getMax() == null) {
            return null;
        }
        return remove(getMax());
    }
    
    public E getMin() {
        if (isEmpty()) {
            return null;
        } else {
            return root.getMin();
        }
    }
    
    public E getMax() {
        if (isEmpty()) {
            return null;
        } else {
            return root.getMax();
        }
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
