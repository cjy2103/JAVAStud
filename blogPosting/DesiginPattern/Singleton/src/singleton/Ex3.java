package singleton;

// Thread safe + lazy
public class Ex3 {
    // Instance
    private static Ex3 instance;

    public static synchronized Ex3 getInstance(){
        if (instance == null){
            instance = new Ex3();
        }
        return instance;
    }
}
