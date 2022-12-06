public class Test {

    public void textBlock(){
        String str = """
                동해물과
                백두산이
                마르고 닮도록
                하느님이
                보우하사
                우리나라 만세
                무궁화 삼천리 화려강산
                대한사람
                대한으로
                길이보전하세
                """;

        System.out.println(str);
    }

    public void textBlock2(){
        String str = """
                "쌍따옴표 표기 가능!!"
                ""이중으로도 가능""
                \"""삼중으로 표현\"""
                \n
                이스케이프 문자도 적용이 됨.
                """;

        System.out.println(str);
    }

    public void textBlock3(){
        String car = "스포티지 하이브리드";
        int price = 4000;

        System.out.printf("""
                차종 : %s
                가격 : %d
                """, car,price);

        car = "토레스";
        price = 3400;

        System.out.println("""
                차종 : %s
                가격 : %d
                %n""".formatted(car, price)
        );
    }
}
