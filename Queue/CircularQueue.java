import java.io.EOFException;
public class CircularQueue {
    //Array has stack inside
    protected int[] data;
    private static final int DEFAULT_SIZE  = 10;
     //for indexing while adding or removing
    protected int front = 0;
    protected int end = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){ // if you pass your own size of array the ndefault is n ot considered
        this.data = new int[size];
    }

    //Method to push/add item in stack array
    public boolean enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;//item add at rear point
        end = end%data.length; // return the index of the element that you had add currently between 0 to array length
        size++;
        return true;
    }

    //Method to pop/remove an element from an array
    public int dequeue() throws QueueExceptions {
        if(isEmpty()){
            throw new QueueExceptions("Cannot remove from an empty Queue!!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front()throws QueueExceptions {
        if(isEmpty()){
            throw new QueueExceptions("Cannot peek from an empty Queue!!");
        }
        return data[front];
    }

    //display method
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i= front;
        do {
            System.out.print(data[i]+" <- ");
            i++;
            i %= data.length;
            
        } while (i != end);
        System.out.print("END");
    }

    //Checking Stack is Full
    public boolean isFull(){
        return size == data.length;// ptr is at last index
    }

    //Checking Stack is Empty or not
    public boolean isEmpty(){
        return size == 0; // indexing is not start yet
    }


}

    

