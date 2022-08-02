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


    public int getPrice() {
        return price;
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
