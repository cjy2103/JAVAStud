import java.util.regex.Pattern;

public class LanguageCheck {

    public boolean englishCheck(String str){
        String regex = "^([a-zA-Z0-9]*)$";

        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(str).matches();
    }

    public boolean koreanCheck(String str){
//        String regex = "^([가-힣]+[0-9]*)$";
        String regex = "^([가-힣]*)$";

        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(str).matches();
    }
}
