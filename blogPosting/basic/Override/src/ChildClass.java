public class ChildClass extends ParentClass{

    @Override
    public void parentMethod() {
        super.parentMethod();
        System.out.println("Child Method");
    }

    @Override
    public void add(int a, int b) {
        super.add(a, b);
        int c = 10;
        System.out.println("합 : "+(a+b+c));
    }

    public void childMethod(){
        System.out.println("Child Method");
    }
}
