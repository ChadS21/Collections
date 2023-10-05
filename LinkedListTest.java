import java.util.Scanner; 
/**
 * Write a description of class LinkedListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedListTest
{
    public boolean expressionTest() {
        MyStackLL<String> stack = new MyStackLL<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an expression:");
        String str = input.nextLine();
        String closed = "";
        int length = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("(") || 
                    str.substring(i, i + 1).equals("[") || 
                    str.substring(i, i + 1).equals("{"))
            {
                stack.push(str.substring(i, i + 1));
                length++;
            }
            if (str.substring(i, i + 1).equals(")") || 
                    str.substring(i, i + 1).equals("]") || 
                    str.substring(i, i + 1).equals("}"))
            {
                closed += str.substring(i, i + 1);
            }
        }

        for (int i = 0; i < closed.length(); i++)
        {
            if (stack.top().equals("("))
            {
                if (closed.substring(i, i + 1).equals(")"))
                {
                    stack.pop();
                }
            }
            else if (stack.top().equals("["))
            {
                if (closed.substring(i, i + 1).equals("]"))
                {
                    stack.pop();
                }
            }
            else if (stack.top().equals("{"))
            {
                if (closed.substring(i, i + 1).equals("}"))
                {
                    stack.pop();
                }
            }
        }
        
        return length == closed.length();
    }
    
    public void reverseTest()
    {
        MyQueueLL<Integer> stack = new MyQueueLL<Integer>();
        
    }
}
