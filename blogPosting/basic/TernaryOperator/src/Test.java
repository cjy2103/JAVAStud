public class Test {

    // if else
    public void testCaseIf(int num){
        int a;
        if(num > 10){
            a = 70;
        } else {
            a = 30;
        }
        System.out.println(a);
    }

    // 삼항 연산자
    public void testImprove(int num){
        int a = (num > 10) ? 70 : 30;
        System.out.println(a);
    }
}
