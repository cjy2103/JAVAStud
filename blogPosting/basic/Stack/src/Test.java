import java.util.Stack;

public class Test {
    public void stackTest(){

        Stack<Integer> stack = new Stack<>(); // int형 스택 선언
        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.println(stack.peek()); // stack의 가장 상단의 값 출력

        System.out.println(stack.size()); // stack의 크기 출력
        System.out.println(stack.empty()); // stack이 비었는지 check
        System.out.println(stack.contains(5)); // stack에 5가 있는지 check ( true/false 반환 )

        System.out.println(stack.pop());  // stack 최상위 값 제거
        stack.clear(); // stack 전체 값 제거
        System.out.println(stack.empty());

    }
}
