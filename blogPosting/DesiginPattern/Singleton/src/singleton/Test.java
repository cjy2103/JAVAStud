package singleton;

//static block
public class Test {

    private static Test instance;

    static {
        try{
            instance = new Test();
        } catch (Exception e){
            throw new RuntimeException("인스턴스 생성 실패 msg = "+e.getMessage());
        }
    }

    public static Test getInstance(){
        if(instance == null){
            instance = new Test();
        }
        return instance;
    }
}
