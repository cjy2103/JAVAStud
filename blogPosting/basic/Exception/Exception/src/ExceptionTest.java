public class ExceptionTest {

    public void npeTest() {
        String str = null;

        try {
            if (str.isEmpty()) {
                System.out.println("공백");
            } else {
                System.out.println(str + "출력");
            }
        } catch (NullPointerException e){
            System.out.println("NPE 발생, 상세내용: "+e);
        } finally {
            System.out.println("모르겠고 일단 실행시켜");
        }
    }

    public void npeTest2() {
        try{
            test();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void test() throws NullPointerException{
        System.out.println("이곳에서 예외를 처리하겠다.");
    }


}
