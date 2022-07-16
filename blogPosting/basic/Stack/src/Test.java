import java.util.Stack;

public class Test {
    public void stackTest(){

        Stack<Integer> stack = new Stack<>(); // int�� ���� ����
        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.println(stack.peek()); // stack�� ���� ����� �� ���

        System.out.println(stack.size()); // stack�� ũ�� ���
        System.out.println(stack.empty()); // stack�� ������� check
        System.out.println(stack.contains(5)); // stack�� 5�� �ִ��� check ( true/false ��ȯ )

        System.out.println(stack.pop());  // stack �ֻ��� �� ����
        stack.clear(); // stack ��ü �� ����
        System.out.println(stack.empty());

    }
}
