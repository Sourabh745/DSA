//Array has stack inside

import java.io.EOFException;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE  = 10;
    int ptr = -1; //for indexing while adding or removing

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){ // if you pass your own size of array the ndefault is n ot considered
        this.data = new int[size];
    }

    //Method to push/add item in stack array
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    //Method to pop/remove an element from an array
    public int pop() throws StackExceptions {
        if(isEmpty()){
            throw new StackExceptions("Cannot pop from an empty Stack!!");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }

    public int peek()throws StackExceptions {
        if(isEmpty()){
            throw new StackExceptions("Cannot peek from an empty Stack!!");
        }
        return data[ptr];
    }

    //Checking Stack is Full
    public boolean isFull(){
        return ptr == data.length-1;// ptr is at last index
    }

    //Checking Stack is Empty or not
    public boolean isEmpty(){
        return ptr == -1; // indexing is not start yet
    }


}
