import CircularLinkedList.CLL;

public class Main2 {
    public static void main(String[] args) {
        CLL cl = new CLL();
        cl.insertFirst(1);
        cl.insertFirst(2);
        cl.insertFirst(3);
        cl.insertFirst(4);
        cl.insertFirst(5);
        cl.display();
        cl.delete(1);
        cl.display();
    }
}
