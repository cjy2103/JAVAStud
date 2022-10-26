public class ThreadTest extends Thread{

    private int pos;
    private String[] array;

    public ThreadTest(int pos, String[] array) {
        this.pos = pos;
        this.array = array;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(array[pos]);  // 쓰레드 시작
        System.out.println(pos);
        try {
            Thread.sleep(1000);  // 1초 대기한다.
        } catch (Exception e) {
        }
    }


    public void thread(){
        Thread thread = new Thread(()->{

        });

    }
}
