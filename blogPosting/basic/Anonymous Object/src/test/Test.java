package test;

public class Test {
    public Parent p1;
    public Parent p2;
    public Parent p3;

    public Test() {
        this.p1 = new Parent(); //  일반적인 객체 생성
        this.p2 = new Child();  // 업 캐스팅
        this.p3 = new Parent() {
           public String str = "Test";

            @Override
            public void check() {
                System.out.println(str);
            }
        };
    }

    public void check(){
        this.p1.check();
        this.p2.check();
        this.p3.check();
    }
}
