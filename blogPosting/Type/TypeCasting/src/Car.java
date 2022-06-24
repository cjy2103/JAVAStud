public class Car extends Vehicle{

    private String name;


    public Car(String type) {
        super(type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void type(){
        System.out.println("탈것의 종류는"+type+"입니다.");
    }

    public void select(){
        System.out.println("현재 선택한 자동차는 "+name+"입니다");
    }
}
