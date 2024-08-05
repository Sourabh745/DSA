public class StackMain {
    public static void main(String[] args) throws StackExceptions {
        CustomStack stack = new CustomStack(6);
        stack.push(23);
        stack.push(53);
        stack.push(54);
        stack.push(56);
        stack.push(57);
        stack.push(58);
        stack.push(58);
        stack.push(58);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        // DynamicStack stack = new DynamicStack(6);
        // stack.push(23);
        // stack.push(53);
        // stack.push(54);
        // stack.push(56);
        // stack.push(57);
        // stack.push(58);
        // stack.push(58);
        // stack.push(58);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

    }
}
