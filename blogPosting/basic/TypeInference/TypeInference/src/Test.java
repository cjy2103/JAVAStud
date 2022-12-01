public class Test {

    public void stringType(String compare) {
        var word    = "Hello";

        if(word.equals(compare)){
            System.out.println("값은 같다.");
        } else {
            System.out.println("값은 다르다..");
        }
    }

    public void intType(int number) {
        var score = 40;

        System.out.println("총합:"+(score+number));

    }

    public void floatType(float number) {
        var num = 4.5;
        System.out.println("몫:"+(num/number));
    }
}
