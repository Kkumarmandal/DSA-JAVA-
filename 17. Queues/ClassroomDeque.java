import java.util.*;

public class ClassroomDeque {
    public static void main(String[] args) {
        Deque <Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        System.out.println(deque);

        deque.remove();
        deque.removeFirst();
        System.out.println(deque);

        deque.addLast(4);
        deque.addLast(5);
        System.out.println(deque);
        System.out.println("First element " + deque.getFirst());
        System.out.println("Last Element " + deque.getLast());
    }
    
}
