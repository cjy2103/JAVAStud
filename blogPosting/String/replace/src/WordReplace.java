import java.util.ArrayList;

public class WordReplace {

    /**
     * @DESC: 일반적인 경우
     */
    public void caseNormal(){
        String origin = "Hello World!";
        StringBuilder output = new StringBuilder();
        ArrayList<Character> array = new ArrayList<>();
        for(int i=0;i<origin.length();i++){
            array.add(origin.charAt(i));
        }


        for(Character word : array){
            if(word.equals('o')){
                word = 'e';
            }
            output.append(word);
        }

        System.out.println(output);
    }

    /**
     * @DESC: replace 메서드 사용
     */
    public void useReplace(){
        String origin = "Hello World!";
        String changeWord = origin.replace("o","e");

        System.out.println(changeWord);

    }
}
