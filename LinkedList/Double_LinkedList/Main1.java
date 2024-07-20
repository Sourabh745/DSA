import java.util.Scanner;

import DoubleLinkedList.DLL;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL dl = new DLL();
        // dl.insertFirst(1);
        // dl.insertFirst(2);
        // dl.insertFirst(3);
        // dl.display();
        System.out.println();
        dl.insertLast(5);
        dl.insertLast(6);
        dl.insertLast(3);
        dl.insertLast(4);
        dl.insertLast(1);
        dl.display();
        System.out.println();
        System.out.println("Inserting element acc. to index ");
        System.out.print("Enter the value ");
        int val =  sc.nextInt();
        System.out.println("Enter the index ");
        int pos = sc.nextInt();
        dl.insertMid(val, pos);
        dl.display();
    }
}
