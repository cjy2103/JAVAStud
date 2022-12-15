import java.util.Iterator;
import java.util.concurrent.Flow;

public class MySubscription implements Flow.Subscription {

    private Iterator<Integer> list;
    private Flow.Subscriber   subscriber;


    public MySubscription(Iterable<Integer> list, Flow.Subscriber subscriber) {
        System.out.println("구독 정보 생성됨");
        this.list = list.iterator();
        this.subscriber = subscriber;
    }

    @Override
    public void request(long n) {
        System.out.printf("""
                구독 알림 %d개씩 받음
                """, n);
        while (n-- >0){
            if(list.hasNext()){
                try {
                    subscriber.onNext(list.next());
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                subscriber.onComplete();
            }
        }
    }

    @Override
    public void cancel() {
        System.out.println("구독 취소");
    }
}
