/**
 * My version of a Binary Tree Node
 *
 * @author Chad Sawyer
 * @version 12/9/23
 */
public class BinaryTreeNode<E extends Comparable<E>>
{

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
    
    /**
     * Traverses the tree until finding the correct place to insert the new
     * node
     *
     * @param  element the data to be added
     */
    public void insert(E element) {
        if (element.compareTo(data) <= 0) {
            if (left == null) {
                left = new BinaryTreeNode<E>(element);
            } else {
                left.insert(element);
            }
        } else {
            if (right == null) {
                right = new BinaryTreeNode<E>(element);
            } else {
                right.insert(element);
            }
        }
    }
    
    /**
     * Traverses the tree until finding the element, if not found, returns null
     *
     * @param  element the data to be searched
     * @return the element searched if found
     */
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
    
    /**
     * Traverses the list until finding the right element and removes. If
     * removing the root, replaces the root with the minimum Node
     *
     * @param  element the data to be removed
     * @return the deleted element
     */
    public BinaryTreeNode<E> remove(E element) {
        if (data.equals(element)) {
            if (left == null && right == null) {
                return null;
            }
            else if (left != null && right == null) {
                return left;
            }
            else if (left == null && right != null) {
                return right;
            }
            else if (left != null && right != null) {
                data = left.getMax();
                left = left.removeMax();
                return this;
            }
        }
        if (element.compareTo(data) <= 0) {
            left = left.remove(element);
            return this;
        }
        else {
            right = right.remove(element);
            return this;
        }
    }

    /**
     * Removes the minimum value in the tree
     *
     * @return the deleted element
     */
    public BinaryTreeNode<E> removeMin() {
        return remove(getMin());
    }
    
    /**
     * Removes the maximum value in the tree
     *
     * @return the deleted element
     */
    public BinaryTreeNode<E> removeMax() {
        return remove(getMax());
    }
    
    /**
     * Returns the minimum value in the tree
     *
     * @return the tree's largest value
     */
    public E getMin() {
        if (left == null) {
            return data;
        } else {
            return left.getMin();
        }
    }
    
    /**
     * Returns the maximum value in the tree
     *
     * @return the tree's largest value
     */
    public E getMax() {
        if (right == null) {
            return data;
        } else {
            return right.getMax();
        }
    }
    
    /**
     * Returns the amount of layers in the tree
     *
     * @return depth of the tree
     */
    public int getDepth() {
        int leftCount = 0;
        int rightCount = 0;
        if (left != null) {
            leftCount += left.getDepth();
        }
        if (right != null) {
            rightCount += right.getDepth();
        }
        
        if (leftCount >= rightCount) {
            return 1 + leftCount;
        } else {
            return 1 + rightCount;
        }
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
    
    public String toString() {
        String str = "";
        if (left != null) {
            str += left.toString() + ", ";
        }
        str += data;
        if (right != null) {
            str += ", " + right.toString();
        }
        return str;
    }
    
    
     /**     * Prints elements as stored in the tree
     *
     * @param maxElementWidth The maximum space allowed for the string form
     *                        of the element.
     */
    public void printTree(int maxElementWidth) {
        int maxSize = (int) Math.pow(2, (getDepth() + 1));
        String[] elements = new String[maxSize];

        // Build array of elements
        printTree(elements, 0, maxElementWidth);

        // Print element properly spaced
        int fullWidth = (int) Math.pow(2, getDepth()) * (maxElementWidth + 1);
        for (int i = 0; i < getDepth() + 1; i++) {
            String connectionsLevel = "";
            String elementsLevel = "";

            for (int j = (int) Math.pow(2, i) - 1; j < (int) Math.pow(2, i + 1) - 1; j++) {

                // Process arrows for this level
                String arrow = "  ";
                int elementLength = arrow.length();
                if (elements[j] != null) {
                    if (j % 2 == 1) { // Odd is left child
                        arrow = " /";
                    } else { // Even is right child
                        arrow = "\\ ";
                    }
                }

                // Center within maxElementWidth
                String leftPadStr = ""; // Default
                String rightPadStr = ""; // Default
                int leftPadNum = (fullWidth / (int) Math.pow(2, i) - elementLength) / 2;
                int rightPadNum = fullWidth / (int) Math.pow(2, i) - elementLength - leftPadNum;
                if (leftPadNum > 0) {
                    leftPadStr = String.format("%" + leftPadNum + "s", " ");
                }
                if (rightPadNum > 0) {
                    rightPadStr = String.format("%" + rightPadNum + "s", " ");
                }
                connectionsLevel += leftPadStr + arrow + rightPadStr;

                // Process elements for this level
                elementLength = 0;
                if (elements[j] != null) {
                    elementLength = elements[j].toString().length();
                }

                // Center within maxElementWidth
                leftPadStr = ""; // Default
                rightPadStr = ""; // Default
                leftPadNum = (fullWidth / (int) Math.pow(2, i) - elementLength) / 2;
                rightPadNum = fullWidth / (int) Math.pow(2, i) - elementLength - leftPadNum;
                if (leftPadNum > 0) {
                    leftPadStr = String.format("%" + leftPadNum + "s", " ");
                }
                if (rightPadNum > 0) {
                    rightPadStr = String.format("%" + rightPadNum + "s", " ");
                }

                if (elements[j] != null) {
                    elementsLevel += leftPadStr + elements[j] + rightPadStr;
                } else {
                    elementsLevel += leftPadStr + rightPadStr;
                }
            }

            if (i > 0) { // Do not print arrows for root
                System.out.println(connectionsLevel);
            }
            System.out.println(elementsLevel);
        }
    }

    // build array of element strings
    private void printTree(String[] elements, int nodeNum, int maxElementWidth) {
        elements[nodeNum] = data.toString();
        if (elements[nodeNum].length() > maxElementWidth) {
            elements[nodeNum] = elements[nodeNum].substring(0, maxElementWidth);
        }
        if (left != null) {
            left.printTree(elements, (nodeNum + 1) * 2 - 1, maxElementWidth);
        }
        if (right != null) {
            right.printTree(elements, (nodeNum + 1) * 2, maxElementWidth);
        }
    }
}
