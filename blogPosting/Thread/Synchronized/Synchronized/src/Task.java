public class Task implements Runnable{
    Account account = new Account();

    @Override
    public void run() {
        while (account.totalMoney > 0){
            // 100 ~ 1000원 출금
            int money = (int)((Math.random() * 10) +1) * 100;
            account.withDraw(money);
        }
    }
}
