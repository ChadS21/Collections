public class stackTest
{
    public void stackTest()
    {
        MyStack stack = new MyStack();
        
        
        stack.push(213);
        System.out.println(stack);
        stack.push(13);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push(112);
        stack.push(15);
        stack.push(23);
        stack.push(67);
        stack.push(83);
        stack.push(83);
        stack.push(83);
        stack.push(89);
        System.out.println(stack);
        stack.push(3);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
    }
}
