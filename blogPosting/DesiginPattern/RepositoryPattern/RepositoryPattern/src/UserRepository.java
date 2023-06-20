// 레포지토리 인터페이스
public interface UserRepository {
    User findId(String id);
    void save(User user);
    void delete(User user);
}
