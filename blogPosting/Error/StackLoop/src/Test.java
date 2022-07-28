import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {

            int val = Integer.parseInt(br.readLine());

            if(val == 0) {
                stack.pop();
            } else {
                stack.push(val);
            }
        }

        int sum = 0;

//        int size = stack.size();
//        for(int i=0; i<size; i++) {
//            System.out.println(stack.pop());
//        }

//        Iterator<Integer> iterator = stack.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(stack.pop());
//        }


        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
