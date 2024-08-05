//package Stack;

import java.util.Stack;

public class StackTutorial {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(34);// collection adding method
        stack.push(45);// stack adding method
        stack.push(null);
        stack.push(65);

        System.out.println(stack.pop());
        System.out.println(stack);

        
    }
}
