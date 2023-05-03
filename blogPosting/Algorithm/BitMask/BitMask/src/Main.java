public class Main {
    public static void main(String[] args) {
        // 빈 집합 생성
        int set = 0;
        // 집합에 추가할 원소
        int a = 1;
        int b = 3;
        int c = 4;

        // 집합에 원소 추가
        set |= (1<<a);
        set |= (1<<b);
        set |= (1<<c);
        
        System.out.println("집합:"+Integer.toBinaryString(set));
        System.out.println("집합크기:"+Integer.bitCount(set));

        if ((set & (1 << b)) != 0) { // b가 집합에 포함되어 있는지 확인
            System.out.println("b가 집합에 포함되어 있습니다.");
        }
        set &= ~(1 << a); // 집합에서 a 제거
        System.out.println("집합: " + Integer.toBinaryString(set)); // 집합 출력

    }
}