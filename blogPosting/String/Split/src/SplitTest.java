public class SplitTest {
    // # 자르기
    public void test(){
        String str = "He#ll#o";
        String[] array = str.split("#");
        for(String arrStr : array){
            System.out.println(arrStr);
        }
        System.out.println("===========================");
    }

    // 쉼표 자르기
    public void test2(){
        String str = "가,나.다.라,마,바";
        String[] array = str.split(",");
        for(String arrStr : array){
            System.out.println(arrStr);
        }
        System.out.println("===========================");
    }

    // 공백 자르기
    public void test3(){
        String str = "Split 문자 공백 자르기 테스트";
        String[] array = str.split(" ");
        for(String arrStr : array){
            System.out.println(arrStr);
        }
    }
}
