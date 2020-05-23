import java.util.*;
class ArrayQueue
{
    public static void main(String [] args)
    {
        Deque<String> dequeue = new ArrayDeque();
        dequeue.add("adarsh");
        dequeue.addFirst("anand");
        dequeue.offerFirst("harsha");
        dequeue.removeFirst();
        dequeue.removeLast();
        System.out.println(dequeue);
    }
}