import linkedList.LL1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL1 list = new LL1();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        // System.out.println();
        // System.out.println("Insert value at last");
        // list.insertLast(7);
        // list.display();
        // System.out.println();
        // System.out.print("Enter the number you want to add: ");
        // int num = sc.nextInt();
        // System.out.print("Where you want to add: ");
        // int index = sc.nextInt();
        // list.insertMid(num, index);
        // list.display();
        // System.out.println();
        // System.out.print("Delete First Element ");
        // list.DeleteFirst();
        // list.display();
        // System.out.println();
        // System.out.print("Delete last element ");
        // list.DeleteLast();
        // list.display();
        // System.out.println();
        // System.out.print("Give the index of the number you want to Delete ");
        // int pos = sc.nextInt();
        // System.out.println(list.Delete(pos));
        // list.display();
        System.out.println("Enter the value you want to find ");
        int value = sc.nextInt();
        list.findNode(value);

    }
}
