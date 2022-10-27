public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread(task);
        thread1.setName("철수");
        Thread thread2 = new Thread(task);
        thread2.setName("영희");

        thread1.start();
        thread2.start();


    }
}