import java.awt.*;

public class Immutable {
    private final String str;

    public Immutable(String str) {
        this.str = str;
    }

    public String toString(){
        return this.str;
    }
}
