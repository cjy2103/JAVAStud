import java.util.concurrent.Flow;

public class MySubscriber implements Flow.Subscriber<Integer> {

    private Flow.Subscription subscription;
    private int maxSize = 3;
    private int size = maxSize;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("2.구독 응답(구독 정보 - 데이터, 구독자)");
        this.subscription = subscription;
        subscription.request(size);
    }

    @Override
    public void onNext(Integer item) {
        System.out.println("4.알림 받음:"+item);
        size--;
        if(size == 0){
            size = maxSize;
            subscription.request(size);
        }
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("오류 발생 구독 정보 넘길수 없음");
    }

    @Override
    public void onComplete() {
        System.out.println("모든 정보 전송 완료");
    }
}
