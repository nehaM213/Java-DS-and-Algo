import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(90);
        stack.push(100);
        int popped = stack.pop();
        System.out.println(popped);
        // popped = stack.pop();
        // System.out.println(popped);
        // popped = stack.pop();
        // System.out.println(popped);

        int peeked = stack.peek();
        System.out.println(peeked);
    }
}