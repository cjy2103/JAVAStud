public class Main {
    public static void main(String[] args) {

        MutableTest mutableTest = new MutableTest();
        System.out.println("Mutable");
        mutableTest.test();

        ImmutableTest immutableTest = new ImmutableTest();
        System.out.println("\nImmutable");
        immutableTest.test();

    }
}
