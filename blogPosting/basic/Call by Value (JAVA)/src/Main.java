public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        System.out.println("메서드 호출전 a="+a+" b="+b);
//        swapInt(a,b);
//        System.out.println("메서드 후출후 a="+a+" b="+b);
//        String name = "Test";
//        String name2 = "Java";
//        System.out.println("메서드 호출전 name="+name+" name2="+name2);
//        swapString(name, name2);
//        System.out.println("메서드 호출후 name="+name+" name2="+name2);
        Car car = new Car();
        car.test();
    }

    public static void swapInt(int a, int b){
        a = 20;
        b = 10;
        System.out.println("SwapInt a="+a+" b="+b);
    }
public static void swapString(String a, String b){
        a = "Java";
        b = "Test";
        System.out.println("메서드 호출전 name="+a+" name2="+b);
    }

}
