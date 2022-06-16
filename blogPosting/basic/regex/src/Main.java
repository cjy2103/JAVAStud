public class Main {
    public static void main(String[] args) {
        LanguageCheck languageCheck = new LanguageCheck();

        System.out.println(languageCheck.englishCheck("하이"));
        System.out.println(languageCheck.englishCheck("Hello"));

        System.out.println(languageCheck.koreanCheck("하이"));
        System.out.println(languageCheck.koreanCheck("Hello"));
    }
}
