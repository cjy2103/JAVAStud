package test;

public class Child extends Parent{
    private String str = "Child";

    @Override
    public void check() {
        System.out.println(str);
    }
}
