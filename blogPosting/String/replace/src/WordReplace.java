import java.util.ArrayList;

public class WordReplace {

    /**
     * @DESC: �Ϲ����� ���
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
     * @DESC: replace �޼��� ���
     */
    public void useReplace(){
        String origin = "Hello World!)";
        String changeWord = origin.replace(")","");

        System.out.println(changeWord);

    }

    /**
     * @DESC: replaceAll �޼��� ���
     */
    public void useReplaceAll(){
        String origin = "Hello World!)";
        String changeWord = origin.replaceAll("\\)","");

        System.out.println(changeWord);
    }

    /**
     * @DESC: replaceFirst ���
     */
    public void useReplaceFirst(){
        String origin = "Hello World!";
        String changeWord = origin.replaceFirst("o","e");

        System.out.println(changeWord);

    }
}