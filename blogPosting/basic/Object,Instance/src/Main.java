public class Main {

    public static void main(String[] args) {
        Frame redBean; // 객체 ( 붕어빵 )
        // 인스턴스화
        redBean = new Frame("팥붕어빵"); // redBean은 Frame 클래스의 '인스턴스' (붕어빵 종류)
        redBean.printName();

        Frame puff; // 객체 ( 붕어빵 )
        //인스턴스화
        puff = new Frame("슈크림 붕어빵"); // puff는 Frame 클래스의 '인스턴스' (붕어빵 종류)
        puff.printName();

        Frame choco; // 객체 (붕어빵)
        //인스턴스화
        choco = new Frame("초코 붕어빵"); // choco는 Frame 클래스의 '인스턴스' (붕어빵 종류)
        choco.printName();


    }
}
