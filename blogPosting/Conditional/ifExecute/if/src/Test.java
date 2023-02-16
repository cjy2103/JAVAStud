public class Test {
    String str;
    public void test(){
        if(str == null || str.equals("")){
            System.out.println("출력");
        }
    }

    public void test2(){
        int x = 5;
        int y = 10;
        if (x++ < 6 || y++ < 12 && x < 6) {
            // Do something
            System.out.println("조건 만족");
        } else {
            // Do something else
            System.out.println("조건 불만족");
        }

    }

}
