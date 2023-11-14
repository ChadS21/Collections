import java.util.NoSuchElementException;
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
    
    public E getMin() {
        if (isEmpty()) {
            return null;
        } else if (size == 1) {
            return root.getData();
        } else {
            BinaryTreeNode<E> parent = root;
            while (parent.getLeft() != null) {
                parent = parent.getLeft();
            }
            return parent.getData();
        }
    }
    
    public E getMax() {
        if (isEmpty()) {
            return null;
        } else if (size == 1) {
            return root.getData();
        } else {
            BinaryTreeNode<E> parent = root;
            while (parent.getRight() != null) {
                parent = parent.getRight();
            }
            return parent.getData();
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
}
