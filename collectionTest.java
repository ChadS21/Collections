public class collectionTest
{
    public void stackTest()
    {
        MyStack<Integer> stack = new MyStack<Integer>();
        
        stack.push(213);
        System.out.println(stack);
        stack.push(13);
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
        stack.push(2); //Out of Bounds
    }
    
    public void queueTest()
    {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        queue.enqueue(100);
        System.out.println(queue);
        queue.enqueue(13);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(31);
        queue.enqueue(65);
        queue.enqueue(37);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue(324);
        queue.enqueue(23);
        queue.enqueue(45);
        queue.enqueue(83);
        queue.enqueue(89);
        System.out.println(queue);
        queue.enqueue(3);
        System.out.println(queue);
        queue.enqueue(2);
        System.out.println(queue);
        queue.enqueue(99);
        queue.enqueue(234567);
        System.out.println(queue); //Out of Bounds
    }
    
    public void stringTest()
    {
        MyStack<String> stack = new MyStack<String>();
        
        stack.push("Bottom");
        System.out.println(stack);
        stack.push("New");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println();
        
        MyQueue<String> queue = new MyQueue<String>();
        
        queue.enqueue("Array");
        System.out.println(queue);
        queue.enqueue("Queue");
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue(); //Out of Bounds
    }
}
