import java.io.Serializable;

public class Data implements Serializable {
    private static final long serialVersionUID = 1L;
    private String message;

    public Data(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
