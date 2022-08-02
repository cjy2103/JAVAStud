public class Suv implements Comparable<Suv>{

    private String name;
    private int price;

    public Suv(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Suv o) {

        if(this.price > o.price){
            return 1;
        } else if(this.price < o.price){
            return -1;
        } else {
            return 0;
        }
    }
}
