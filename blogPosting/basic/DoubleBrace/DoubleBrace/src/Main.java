import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
        }};
        HashSet<String> country = new HashSet<>(){
            {
                add("한국");
                add("미국");
                add("일본");
                add("중국");
                add("독일");
            }
        };
        HashMap<String,String> student = new HashMap<>(){
            {
                put("철수","컴퓨터공학과");
                put("영희","경제학과");
                put("길동","건축학과");
            }
        };

        System.out.println(arrayList);
        System.out.println(country);
        System.out.println(student);


    }
}