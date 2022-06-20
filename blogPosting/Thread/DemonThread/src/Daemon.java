public class Daemon extends Thread{

    @Override
    public void run() {
        super.run();
        if(Thread.currentThread().isDaemon()){
            while (true){
                try{
                    Thread.sleep(100);
                    System.out.println("Daemon Thread");
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        } else {
            System.out.println("Normal Thread");
        }
    }

}
