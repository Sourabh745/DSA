package CircularLinkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            tail = node ;
            head = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        Node temp= head;
        if(temp == null){
            return;
        }

        if(head.val  == val){
            tail.next = temp.next;
            head = temp.next;
        }
        
        while(temp.val != val){
            if(temp.next.val == val){
                temp.next = temp.next.next; 
                return;
            }
            temp = temp.next;
        }

    }

    public void display(){
        Node temp = head;
        if(head != null){
        do{
            System.out.print(temp.val+ " -> ");
            temp = temp.next;
        }while (temp != head) ; //after a reptition head == temp then it
        System.out.println(" END ");
    }
}



    public class Node{
        private Node next;
        private int val;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
