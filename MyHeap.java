import java.util.Arrays;
/**
 * Write a description of class MyHeap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyHeap<E extends Comparable<E>> 
{
    private E[] heap;
    private int last;
    
    /**
     * Constructor for objects of class MyHeap
     */
    public MyHeap()
    {
        last = -1;
        heap = (E[]) new Comparable[16];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void add(E element)
    {
        if (last == heap.length - 1) {
            heap = Arrays.copyOf(heap, heap.length * 2);
        }
        if (isEmpty()) {
            heap[0] = element;
            last++;
        }
        else {
            heap[last + 1] = element;
            last++;
            int i = last;
            while ((i - 1) / 2 >= 0) {
                if (heap[i].compareTo(heap[(i - 1) / 2]) <= 0) {
                    E temp = heap[i];
                    heap[i] = heap[(i - 1) / 2];
                    heap[(i - 1) / 2] = temp;
                    i = (i - 1) / 2;
                }
                else {
                    return;
                }
            }
        }
    }
    
    public E getMin(E element) {
        if (size() > 0) {
            return heap[0];
        }
        return null;
    }
    
    public E removeMin() {
        if (isEmpty()) {
            return null;
        }
        E removed = heap[0];
        heap[0] = heap[last];
        heap[last] = null;
        last--;
        int i = 0;
        while ((i * 2) + 1 <= last && (i * 2) + 2 <= last) {
            int compare = heap[(i * 2) + 1].compareTo(heap[(i * 2) + 2]);
            if (compare < 0) {
                E temp = heap[i];
                heap[i] = heap[(i * 2) + 1];
                heap[(i * 2) + 1] = temp;
                i = (i * 2) + 1;
            }
            else {
                E temp = heap[i];
                heap[i] = heap[(i * 2) + 2];
                heap[(i * 2) + 2] = temp;
                i = (i * 2) + 2;
            }
        }
        return removed;
    }
    
    public boolean isEmpty() {
        if (last + 1 == 0) {
            return true;
        }
        return false;
    }
    
    public int size() {
        return last + 1;
    }
    
    /**
     * Prints elements as stored in the tree
     *
     * @param maxElementWidth The maximum space allowed for the string form
     *                        of the element.
     */
    public void printTree(int maxElementWidth) {
        int depth = (int) (Math.log(last + 1) / Math.log(2)) + 1;
        int maxSize = (int) Math.pow(2, depth) - 1;
        String[] elements = new String[maxSize];

        // Build array of elements
        printTree(elements, maxElementWidth);

        // Print element properly spaced
        int fullWidth = (int) Math.pow(2, depth - 1) * (maxElementWidth + 1);
        for (int i = 0; i < depth; i++) {
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
    private void printTree(String[] elements, int maxElementWidth) {
        for (int i = 0; i <= last; i++) {
            elements[i] = heap[i].toString();
        }
    }
    
    public String toString() {
        return Arrays.toString(heap);
    }
}
