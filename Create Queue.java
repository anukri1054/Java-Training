import java.util.ArrayList;


public class ArrayQueue {

    static ArrayList<Integer> queue = new ArrayList<>();

    // Enqueue
    public static void add(int data) {
        queue.add(data);
    }

    //Deque
    public static int remove() {
        if (queue.size() == 0) {
            return -1;
        }

        return queue.remove(0);
    }
    public static void main(String[] args) {


        add(10);
        add(20);
        add(30);

        System.out.println("Queue: " + queue);


        System.out.println("Removing Element: " + remove());

        System.out.println("Removed Queue: " + queue);
    }
}
    

