import java.util.ArrayList;

//클라이언트 (Director)
public class Main {
    public static void main(String[] args) {
        // 빌더를 사용하여 객체 생성
        Person person = new Person.PersonBuilder()
                .withName("철수")
                .withAge(30)
                .withAddress("부산광역시 남구")
                .build();

        // 생성된 객체 출력
        System.out.println(person);
        
    }
}