public class Main {
    public static void main(String[] args) {
        MyPublisher  pub = new MyPublisher();
        MySubscriber sub = new MySubscriber();
        
        pub.subscribe(sub); // 구독 시작


    }
}