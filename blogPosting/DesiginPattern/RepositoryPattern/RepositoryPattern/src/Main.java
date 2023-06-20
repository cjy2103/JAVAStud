public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();

        // 사용자 생성
        User user1 = new User("1","철수");
        User user2 = new User("2","영희");

        userRepository.save(user1);
        userRepository.save(user2);

        // 사용자 조회
        User retrievedUser = userRepository.findId("1");
        System.out.println("Retrieved User: " + retrievedUser.name());

        // 사용자 삭제
        userRepository.delete(user1);

        // 삭제후 재조회
        retrievedUser = userRepository.findId("1");
        System.out.println("Retrieved User after deletion: " + retrievedUser);
    }
}