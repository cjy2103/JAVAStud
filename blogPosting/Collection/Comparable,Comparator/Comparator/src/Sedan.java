import java.util.Comparator;

public class Sedan implements Comparator<Sedan> {
    private String name;
    private int price;

    public Sedan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compare(Sedan o1, Sedan o2) {
        if(o1.price < o2.price){
            return o2.price - o1.price;
        } else {
            return o1.price - o2.price;
        }
    }
}
