public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.setCompany("Kia");
        sedan.setName("K5");
        sedan.setPrice(3500);

        sedan.manufacture();
        sedan.name();
        sedan.price();

        Suv suv = new Suv();
        suv.setCompany("Kia");
        suv.setName("스포티지");
        suv.setPrice(3800);

        suv.manufacture();
        suv.name();
        suv.price();

    }
}
