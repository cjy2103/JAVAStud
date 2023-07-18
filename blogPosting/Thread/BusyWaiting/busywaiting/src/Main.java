public class Main {
    private static volatile boolean conditionMet = false;

    public static void main(String[] args) {
        // 조건이 충족될 때까지 반복적으로 확인하는 스레드
        Thread waitingThread = new Thread(() -> {

            while (!conditionMet) {
                // Busy-waiting: 조건이 충족될 때까지 반복적으로 확인
                // 작업을 수행하지 않고 계속 반복하는 방식
            }

            System.out.println("Condition met! Exiting waiting thread.");
        });

        // 조건을 충족시키는 스레드
        Thread conditionThread = new Thread(() -> {
            try {
                // 일정 시간 대기
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 조건 변경
            conditionMet = true;
            System.out.println("Condition changed! Signaling waiting thread.");
        });

        // 스레드 실행
        waitingThread.start();
        conditionThread.start();
    }

}