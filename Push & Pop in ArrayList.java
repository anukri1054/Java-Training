import java.util.ArrayList;

public class ArraylistStackk {

    public static void main(String[] args) {

        ArrayList<Integer> stack = new ArrayList<>();

        // Push
        stack.add(10);
        stack.add(20);
        stack.add(30);

        System.out.println("Stack: " + stack);

        // Pop
        int popped = stack.remove(stack.size() - 1);

        System.out.println("Popped Element: " + popped);
        System.out.println("Stack After Pop: " + stack);
    }
}
