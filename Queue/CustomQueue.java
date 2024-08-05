//Array has stack inside

import java.io.EOFException;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE  = 10;
     //for indexing while adding or removing
    int last = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){ // if you pass your own size of array the ndefault is n ot considered
        this.data = new int[size];
    }

    //Method to push/add item in stack array
    public boolean add(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[last++] = item;
        //last++;
        return true;
    }

    //Method to pop/remove an element from an array
    public int remove() throws QueueExceptions {
        if(isEmpty()){
            throw new QueueExceptions("Cannot remove from an empty Queue!!");
        }
        int removed = data[0];
        // ptr--;
        // return removed;
        for (int i = 1; i < last; i++) {
            data[i-1] = data[i];
        }
        last--;
        return removed;
    }

    public int front()throws QueueExceptions {
        if(isEmpty()){
            throw new QueueExceptions("Cannot peek from an empty Queue!!");
        }
        return data[0];
    }

    //display method
    public void display(){
        for (int i = 0; i < last; i++) {
            System.out.print(data[i]+", ");
        }
    }

    //Checking Stack is Full
    public boolean isFull(){
        return last == data.length;// ptr is at last index
    }

    //Checking Stack is Empty or not
    public boolean isEmpty(){
        return last == 0; // indexing is not start yet
    }


}
