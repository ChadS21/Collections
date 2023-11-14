/**
 * Write a description of class BinaryTreeNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinaryTreeNode<E extends Comparable<E>>
{
    // instance variables - replace the example below with your own
    private E data;
    private BinaryTreeNode<E> left;
    private BinaryTreeNode<E> right;

    /**
     * Constructor for objects of class BinaryTreeNode
     */
    public BinaryTreeNode(E data) {
        this.data = data;
        left = null;
        right = null;
    }
    
    public void insert(E element) {
        if (element.compareTo(data) < 0) {
            if (left == null) {
                left = new BinaryTreeNode<E>(element);
            } else {
                getLeft().insert(element);
            }
        } else {
            if (right == null) {
                right = new BinaryTreeNode<E>(element);
            } else {
                getRight().insert(element);
            }
        }
    }
    
    public E search(E element)
    {
        if (element == data) {
            return element;
        }
        if (left != null || right != null) {
            if (element.compareTo(data) < 0) {
                return left.search(element);
            }
            else {
                return right.search(element);
            }
        }
        return null;
    }
    
    public E getData() {
        return data;
    }
    
    public BinaryTreeNode<E> getLeft() {
        return left;
    }
    
    public BinaryTreeNode<E> getRight() {
        return right;
    }
    
    public void setLeft(BinaryTreeNode<E> left) {
        this.left = left;
    }
    
    public void setData(E data) {
        this.data = data;
    }
    
    public void setRight(BinaryTreeNode<E> right) {
        this.right = right;
    }
}
