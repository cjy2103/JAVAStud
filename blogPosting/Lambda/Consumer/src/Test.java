import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test {
    public void test(){
        Consumer<String> consumer = System.out :: println;
        consumer.accept("테스트 출력");

        BiConsumer<Integer, Integer> consumer2 = (v1, v2) -> System.out.println("출력값:"+v1 +","+v2);
        consumer2.accept(10,20);
    }
}
