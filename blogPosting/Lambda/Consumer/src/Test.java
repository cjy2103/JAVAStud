import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test {
    public void test(){
        Consumer<String> consumer = System.out :: println;
        consumer.accept("�׽�Ʈ ���");

        BiConsumer<Integer, Integer> consumer2 = (v1, v2) -> System.out.println("��°�:"+v1 +","+v2);
        consumer2.accept(10,20);
    }
}
