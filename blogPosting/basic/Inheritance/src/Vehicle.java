public class Vehicle {
    int price;
    StringBuilder name;

    public Vehicle(){

    }

    public Vehicle(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }
}
