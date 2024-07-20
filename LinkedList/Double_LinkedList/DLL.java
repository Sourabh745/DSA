package DoubleLinkedList;

public class DLL {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head; //
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        
    }

    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            //node.next = null;
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        
    }

    public void insertMid(int val, int pos){
        if(pos == 0){
            insertFirst(val);
            return;
        }
        
        Node temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.next; // final output is positon that we want now we need add new node b/w temp and temp.prev
        }
        //logic
        Node newNode = temp.prev;
        Node node = new Node(val, temp.next, temp.prev);
        temp.prev = node;
        node.next = temp;
        newNode.next = node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while( node != null) {
            System.out.print(node.val + " -> ");
            last = node; // last is adding a node 1->END , then 2->1->END and lastly 3->2->1->END; so the first val of last is 1 now can iterate reverse last.prev
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Printing node in reverse");
        while (last != null) {
            System.out.print(last.val+ " -> ");
            last = last.prev;
        }
        System.out.print("START");
    }


    private class Node {
         int val;
         Node next;
         Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
