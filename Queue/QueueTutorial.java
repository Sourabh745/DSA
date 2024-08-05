//package Queues;
//FIFO means first in first out

//When to use stack and queue 
//when you have to travredal and binary tree bfs and dfs

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTutorial {
    public static void main(String[] args) {
     
        Queue<Integer> queue = new LinkedList<>(); //there is no class Queue because it is interface and linkedllist have wueue functionality
        queue.add(4); 
        queue.add(5);
        queue.add(6);
        queue.add(6);
        queue.add(6);
        queue.add(null);

        System.out.println(queue);// return firsst eleement
        System.out.println(queue.remove());// remove first element
        System.out.println(queue.peek());
        System.out.println((-1%5));

//======================--------------------------------------================================
        //Deque => 1. We can remove and add item from both sides.
        // it throws illegalstateException if no space is available or capacity is restricted.
        // use offer(E e); instead of add(E e) in upper case.
        // remove() throws exception while poll() not throw exception.

        Deque<Integer> deque = new ArrayDeque<>();// arraydeque has resized array this doesnot have capacity used for deque cases 
        // its not thread safe and null elements are not allowed and it is daster than linkedlist and stack and 1. point is also consider

        deque.add(34);
        deque.addLast(34);
        //deque.add(null); // null element are not consider in dequeue
        deque.addLast(21);
        deque.remove(); // by default remove the first element

        System.out.println(deque);

    }
}
