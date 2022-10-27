public class Account {
    int totalMoney = 2000;

    public void withDraw(int money){
        synchronized (this) {
            if (totalMoney >= money) {
                try {
                    Thread thread = Thread.currentThread();
                    System.out.println(thread.getName() + "출금함 금액 :" + money);
                    Thread.sleep(1000);
                    totalMoney -= money;
                    System.out.println(thread.getName() + "출금후 남은 금액: " + totalMoney);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
