import java.util.HashMap;
import java.util.Map;
// 구체적인 레포지토리 클래스
public class UserRepositoryImpl implements UserRepository{

    private Map<String, User> userMap;

    public UserRepositoryImpl() {
        this.userMap = new HashMap<>();
    }

    @Override
    public User findId(String id) {
        return userMap.get(id);
    }

    @Override
    public void save(User user) {
        userMap.put(user.id(), user);
    }

    @Override
    public void delete(User user) {
        userMap.remove(user.id());
    }
}
