public class collectionTest
{
    public void newMyLinkedListTest() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();

        list.add(0, 3);
        System.out.println(list);
        list.add(0,1);
        System.out.println(list);
        list.add(1,2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        
        System.out.println();
        
        MyLinkedList<String> list2 = new MyLinkedList<String>();
        list2.add(0, "c");
        System.out.println(list2);
        list2.add(0,"a");
        System.out.println(list2);
        list2.add(1,"b");
        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2.get(1)); //?
        System.out.println(list2);
        System.out.println(list2);
    }
    
    public void stackTest() {
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
    
    public void queueTest() {
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
    
    public void stringTest() {
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
    
    public void stringTestLL() {
        MyStackLL<String> stack = new MyStackLL<String>();
        
        stack.push("Bottom");
        System.out.println(stack);
        stack.push("New");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println();
        
        MyQueueLL<String> queue = new MyQueueLL<String>();
        
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
    
    public void MyLinkedListTest() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();

        list.addHead(1);
        System.out.println(list);
        list.addHead(2);
        System.out.println(list);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.removeHead();
        System.out.println(list);
        list.removeHead();
        list.removeHead();
        list.add(5);
        System.out.println(list);
        
        System.out.println();
        
        MyLinkedList<String> list2 = new MyLinkedList<String>();
        list2.addHead("a");
        System.out.println(list2);
        list2.addHead("b");
        System.out.println(list2);
        list2.add("c");
        list2.add("d");
        System.out.println(list2);
        list2.removeHead();
        System.out.println(list2);
        list2.removeHead();
        list2.removeHead();
        list2.add("e");
        System.out.println(list2);
    }
    
    public void sortedInsertTest() {
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.add("z");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add(1, "b");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.set(0, "a");
        System.out.println(list);
        list.insertSorted("e");
        System.out.println(list);
        list.insertSorted("d");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.insertSorted("a");
        System.out.println(list);
        list.remove("b");
        System.out.println(list);
        list.insertSorted("b");
        System.out.println(list);
    }
    
    public void getTest() {
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        
        
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
    }
    
    public void doublyTest() {
         MyLinkedList<String> list = new MyLinkedList<String>();     
         
         list.addTail("c"); //add tail and add head @ empty
         System.out.println(list);
         list.remove("c"); //remove element, remove index, and remove head @ size = 1
         System.out.println(list);
         list.add("c"); //add and add head @ empty
         System.out.println(list);
         list.add("d"); //add and add tail @ size > 0
         System.out.println(list);
         list.add(0, "b"); //add @ 0
         System.out.println(list);
         list.add(3, "f"); //add @ size
         System.out.println(list);
         list.add(3, "e"); //add @ < index <
         System.out.println(list);
         list.addHead("a"); //addHead @ not empty
         System.out.println(list);
         list.remove(0); //remove index and remove head @ size > 1
         System.out.println(list);
         list.remove("f"); //remove element, remove index, and remove tail @ end
         list.remove("c"); //remove element, remove index @ < index <
         list.remove("b"); //remove element, remove index, and remove head @ size > 1
         System.out.println(list);
         list.insertSorted("b"); //insert sorted @ 0
         list.insertSorted("d"); //insert sorted @ < index <
         list.insertSorted("g"); //insert sorted @ end
         System.out.println(list);
         list.set(4, "f"); //set tail
         list.addHead("b");
         list.set(0, "a"); //set head
         System.out.println(list);
         list.remove(2);
         System.out.println(list);
         list.insertSorted("b");
         list.set(2, "c"); //set @ < index <
         System.out.println(list);
    }
    
    public void binarySearchTreeTest() {
        BinarySearchTree<String> tree = new BinarySearchTree<String>();
        
        tree.insert("m"); //1
        tree.insert("r"); //2
        tree.insert("h"); //2
        tree.insert("f"); //3
        tree.insert("y"); //3
        tree.insert("z"); //4
        tree.insert("a"); //4
        //tree.insert("g"); //4
        tree.insert("b"); //5

        tree.printTree();
        tree.remove("m");
        //tree.remove("a");
        //tree.remove("r");
        //tree.remove("h");
        tree.printTree();
    }
}
