public class SubString {

    // 전체길이중 마지막 3부분만 출력
    public void subStringTest(){
        String str = "Hello";
        String result = str.substring(str.length()-3);
        System.out.println(result);
    }

    // 특정문자 이후의 문자열 출력
    public void subStringTest2(){
        String str = "Hello/World";
        String result = str.substring(str.lastIndexOf("/")+1);
        System.out.println(result);
    }

    // 특정단어 부분만 출력
    public void subStringTest3(){
        String str = "스포티지 : 3600만원, 토레스 3400만원, 투싼 : 3500만원";
        String target = "토레스";
        int targetNum = str.indexOf(target);
        String result = str.substring(targetNum,(str.substring(targetNum).indexOf("원") + targetNum));
        System.out.println(result);
    }

}



//        System.out.println(targetNum);
//        System.out.println(str.substring(targetNum).indexOf("원"));