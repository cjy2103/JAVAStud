class ConditionExample {
    private boolean conditionMet = false;

    public void runExample() {
        Thread waitingThread = new Thread(() -> {
            synchronized (this) {
                while (!conditionMet) {
                    try {
                        // 조건이 충족될 때까지 대기
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Condition met! Exiting waiting thread.");
        });

        Thread conditionThread = new Thread(() -> {
            try {
                // 일정 시간 대기
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 조건 변경
            synchronized (this) {
                conditionMet = true;
                // 대기 중인 스레드에게 신호를 보내어 깨움
                notifyAll();
            }
            System.out.println("Condition changed! Signaling waiting thread.");
        });

        waitingThread.start();
        conditionThread.start();
    }
}