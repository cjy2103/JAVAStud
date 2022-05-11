public class Suv implements Vehicle, Company{

    private String name;
    private String company;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void manufacture() {
        System.out.println("제조사:"+company);
    }

    @Override
    public void name() {
        System.out.println("차이름:"+name);
    }

    @Override
    public void price() {
        System.out.println("가격:"+price);
    }
}
