import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(5);
        priorityQueue.offer(2);
        priorityQueue.offer(1);

        System.out.println(priorityQueue);

        priorityQueue.poll();
        System.out.println(priorityQueue);

        priorityQueue.remove(5);
        System.out.println(priorityQueue);

//        priorityQueue.clear();
//        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());


    }
}