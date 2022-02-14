public class ClassName<T,K>{
    private T param;
    private K value;

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }

    public <T> T generic(T o){
        return o;
    }
}
