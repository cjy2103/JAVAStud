public class Test2 {
    String name = "테스트2";

    public void setName(final String name) {
//        name = "변경"; // 인자값으로 받은 final 변수 변경 불가능
        this.name = name;
    }

    public void print(){
        System.out.println(name);
    }
}
