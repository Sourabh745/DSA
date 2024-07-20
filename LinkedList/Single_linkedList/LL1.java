package linkedList;
// Single linkedList - one head and one tail | use => when we add new node at the tail | you can only go at forward direction
public class LL1 {

    private Node head; // refrence variable pointing to the next node
    private Node tail; // same as above 

    private int size; // list length

    public LL1(){
        this.size = 0; // 
    }

    // Entering First element 
    public void insertFirst(int val){
        Node node  = new Node(val); // create a new node
        node.next = head; // it's mean new node have address of next node(that is head). so now its not a head anymore 
        head = node; // new node is head now

        if(tail == null){
            tail = head; // in case of empty when we adding 1st element of a list
        }

        size++; 
    }

    //Entering Last Element
    public void insertLast(int val){ // time complexity is constant
        if(tail == null){
            insertFirst(val);
            return ;
        }

        Node node  = new Node(val); // create a new node
        tail.next = node; 
        tail = node; 
        //node = tail; // print the same output
        size++; 
    }

    public void insertMid(int val, int pos){
        if(pos == 0){
            insertFirst(val);
            return;
        }
        if(pos == size){
            insertLast(val);
            return;
        }

        Node temp = head; 
        for (int i = 1; i < pos; i++) { // 
            temp = temp.next;
        }

        Node node = new Node(val, temp.next); // it will connect the new node to the next node acc. to index // without tempnext it will end here so we use comstructor
        temp.next = node;
        size++; 
    }

    public void DeleteFirst(){ // DELETE FIRST ELEMENT
        Node temp = head.next; 
        head = temp;
        if(head == null){
            tail = null;
        }
        size--;

    }

    public void DeleteLast(){ // DELETE LAST ELEMENT
        if(size <= 1){
            DeleteFirst();
        }
        Node node = getIndex(size-1);
        tail = node;
        tail.next = null;
        
    }

    public int Delete(int index){ // DELETE LAST ELEMENT
        Node prevNode = getIndex(index-1); // prev node of the delete one
        Node node = getIndex(index); // node that we want to delelte
        int val = prevNode.next.val;
        if(index == size-1){
            DeleteLast();
        }
        if(index == 0){
            DeleteFirst();
        }
        prevNode.next = node.next;// 1st choice
        //prevNode.next = prevNode.next.next; // 2nd choice
        size--;
        return val;
    }

    //Find value of a Particular node
    public Node findNode(int value){
        Node node = head;
        while (node != null){
            if(node.val == value){
                System.out.println(node);
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node getIndex(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;

    }

    public void display(){
        System.out.println();
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next; // you cannot write head because it change the original head position
        }
        System.out.print("END");
    }

    public class Node {
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }   
}