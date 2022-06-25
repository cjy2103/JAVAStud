public class CountNumber {

    EventListener listener;

    public CountNumber(EventListener listener) {
        this.listener = listener;
    }

    public void count(){
        for(int i=0; i<=100; i++){
            if(i%5 == 0){
                listener.onEvent(i);
            }
        }
    }
}
