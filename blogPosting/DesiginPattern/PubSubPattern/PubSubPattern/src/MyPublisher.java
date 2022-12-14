import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Flow;

public class MyPublisher implements Flow.Publisher<Integer> {

    public ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    @Override
    public void subscribe(Flow.Subscriber<? super Integer> subscriber) {
        System.out.println("1.구독 요청");
    }
}
