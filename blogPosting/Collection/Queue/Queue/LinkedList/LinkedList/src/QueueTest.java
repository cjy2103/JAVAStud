import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public void queueTest(){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.offer(4);


        System.out.println(queue.peek());

        System.out.println(queue);

    }
}
