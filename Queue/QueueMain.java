public class QueueMain {
    public static void main(String[] args) throws Exception {
        // CustomQueue queue = new CustomQueue(5);

        // queue.add(12);
        // queue.add(13);
        // queue.add(14);
        // queue.add(15);
        // queue.add(15);
        // System.out.println("Final output is ");
        // queue.display();

        // System.out.println("First item of the queue is "+queue.front());

        // System.out.println("Removed item from the queue is "+queue.remove());
        // queue.display();


        DynamicQueue queue = new DynamicQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(5);
        queue.enqueue(5);
        System.out.println("Final output is ");
        queue.display();

        System.out.println();
        System.out.println("First item of the queue is "+queue.front());

        System.out.println("Removed item from the queue is "+queue.dequeue());
        queue.display();

        System.out.println();
        System.out.println("Inserting a items ");
        queue.enqueue(23);
        queue.display();


        
    }
}
