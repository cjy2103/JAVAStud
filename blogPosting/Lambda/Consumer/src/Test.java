import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public void consumerTest(){
        Consumer<String> consumer = System.out :: println;
        consumer.accept("�׽�Ʈ ���");

        BiConsumer<Integer, Integer> consumer2 = (v1, v2) -> System.out.println("��°�:"+v1 +","+v2);
        consumer2.accept(10,20);
    }

    public void supplierTest(){
        Supplier<String> supplier = () -> "Supplier �׽�Ʈ";
        System.out.println(supplier.get());

        Scanner sc = new Scanner(System.in);

        IntSupplier intSupplier = sc::nextInt;
        System.out.println(intSupplier.getAsInt());
    }

    public void functionTest(){
        Function<String, Integer> function = Integer::parseInt;
        System.out.println(function.apply("10") + function.apply("20"));
    }

    public void operatorTest(){
        int max = selectMax((a,b) -> (a>=b) ? a : b);
        System.out.println(max);
    }

    private int selectMax(IntBinaryOperator operator){
        int[] numbers = {1,10,100,1000,10000};
        int result = numbers[0];
        for(int num : numbers){
            result = operator.applyAsInt(result, num);
        }
        return result;
    }

    public void predicateTest(){
        HashMap<String, String> car = new HashMap<>() {
            {   put("����Ƽ��","SUV");
                put("����","SUV");
                put("K5","����");
            }
        };

        Predicate<String> predicate = type -> type.equals("SUV");

        for(String key : car.keySet()){
            if(predicate.test(car.get(key))){
                System.out.println(key +"�� SUV �Դϴ�.");
            }
        }

    }

}
