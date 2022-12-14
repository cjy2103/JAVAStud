import java.util.ArrayList;
import java.util.concurrent.Flow;

public class MySubscription implements Flow.Subscription {

    public MySubscription(ArrayList<Integer> list, Flow.Subscriber subscriber) {
        System.out.println("구독정보 생성됨");
    }

    @Override
    public void request(long n) {
        System.out.printf("""
                구독 알림 %d개씩 받음
                """, n);
    }

    @Override
    public void cancel() {
        System.out.println("구독 취소");
    }
}
