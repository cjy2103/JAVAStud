public class StringTest {
    public void concatTest(){
        String a = "String";
        String b = " Test";

        System.out.println(a.concat(b));
    }

    public void appendTest(){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" String");
        sb.append(" Test");
        System.out.println(sb);

    }
}
