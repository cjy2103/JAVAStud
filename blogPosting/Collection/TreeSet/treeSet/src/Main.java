import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);

        System.out.println("numbers: " + numbers); // numbers: [1, 2, 3]

        System.out.println("numbers.contains(2): " + numbers.contains(2)); // numbers.contains(2): true

        System.out.println("numbers.remove(3): " + numbers.remove(3)); // numbers.remove(3): true

        System.out.println("numbers: " + numbers); // numbers: [1, 2]

        System.out.println("numbers.first(): " + numbers.first()); // numbers.first(): 1

        System.out.println("numbers.last(): " + numbers.last()); // numbers.last(): 2

        System.out.println("numbers.headSet(2, true): " + numbers.headSet(2, true)); // numbers.headSet(2, true): [1]

        System.out.println("numbers.tailSet(1, true): " + numbers.tailSet(1, true)); // numbers.tailSet(1, true): [1, 2]
    }
}