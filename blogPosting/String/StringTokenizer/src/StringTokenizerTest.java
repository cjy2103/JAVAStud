import java.util.StringTokenizer;

public class StringTokenizerTest {

    public void defaultDelim(String str){
        System.out.println("처음 문자열: "+str);

        StringTokenizer stringTokenizer = new StringTokenizer(str);

        System.out.println("String Tokenizer 시작");

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }

    public void useDelim(String str){
        System.out.println("처음 문자열: "+str);

//        StringTokenizer stringTokenizer = new StringTokenizer(str,"-");
//        StringTokenizer stringTokenizer = new StringTokenizer(str,"-",true);
        StringTokenizer stringTokenizer = new StringTokenizer(str,"-",false);

        System.out.println("String Tokenizer 시작");

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
