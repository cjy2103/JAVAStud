public class Main {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();
        str.append("안녕하세요");
        str.append(" 문자열 추가");

        System.out.println(str);

        System.out.println(str.insert(4,"값 삽입"));

        System.out.println(str.delete(4,8));

        System.out.println(str.indexOf("자"));

        System.out.println(str.substring(3,8));

        System.out.println(str.length());

        System.out.println(str.replace(4,7,"이걸로 변경"));

        System.out.println(str.reverse());
    }
}
