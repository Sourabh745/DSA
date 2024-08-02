
//package String.StringBuffers_1;
import java.text.DecimalFormat;
import java.util.*;
public class Learning1 {
    public static void main(String[] args){

        //Constructor1 of SB
        StringBuffer sb = new StringBuffer(); // Initialize 16 bit  space

        //constructor2
        StringBuffer sb2 = new StringBuffer("Sourabh");

        //constructor3
        StringBuffer sb3 = new StringBuffer(30);//giving capacity

        sb.append("WeMakeDev");
        sb3.append("nope you are going to rich one day and that day is near");

        String str = sb.toString();//same result with sb print directly
        System.out.println(str);
        System.out.println(sb2);
        System.out.println(sb3);
        sb2.append(" go to hell");// it will not create new abject it will just a add new append into old sb2 in memory
        System.out.println(sb2);

        //insert
        // sb.insert(1, " Rahul ");
        // System.out.println(sb);

        
        //sb.replace(1, 6, "in Smoke ");
        //sb.reverse();
        //sb.delete(0, 5);
        System.out.println(sb2.capacity());
        System.out.println(sb);

        // Random random = new Random();
        // System.out.println(random.nextInt(1,9));
        // System.out.println((char)(97));

        int n = 20;
        RandomString rs = new RandomString();
        String name = RandomString.generate(n);
        System.out.println(name);

        String sent = "he   llooo  new w re  r tt  rr";
        System.out.println(sent.replaceAll("\s", "")); // \\s for all spaces

        String arr = "cat dog bird";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));// Arrays.toString(arrayName) give you uptput in string format or else address

        //rounding off
        DecimalFormat df = new DecimalFormat("0,00.0");
        System.out.println(df.format(729));
        System.out.println(df.getCurrency());
    }
}

/* 
 
 STRING BUFFER
    Mutable sequence of characters unlike string that are mutable
Advantages over string
    Mutable can change data in memory 
    Efficient - you dont have to create object again and again like string have to create new obj
    Thread safe - if one thread is working on that data other thread have to wait until it complete it is little slower AND use string builder if you want to work faster
 
 */
