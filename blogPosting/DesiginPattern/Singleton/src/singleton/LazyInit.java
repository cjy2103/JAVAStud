package singleton;

public class LazyInit {
    private static LazyInit instance;


    public static LazyInit getInstance(){
        if(instance == null){
            instance = new LazyInit();
        }
        return instance;
    }
}
