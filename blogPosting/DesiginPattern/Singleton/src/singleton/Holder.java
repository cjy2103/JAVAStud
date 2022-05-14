package singleton;

public class Holder {

    private static class InnerInstanceClass {
        private static final Holder instance = new Holder();
    }

    public static Holder getInstance(){
        return InnerInstanceClass.instance;
    }
}
