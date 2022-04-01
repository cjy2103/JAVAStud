public class Main {
    public static void main(String[] args) {
        ClassName<String, Integer> className = new ClassName<>();
        ClassName<Integer,Double> className2 = new ClassName<>();

        className.setParam("°ª");
        className.setValue(10);
        className2.setValue(20.0);
        className2.setParam(20);

        System.out.println(className.getParam());
        System.out.println(className.getParam().getClass().getName());
        System.out.println(className.getValue());
        System.out.println(className.getValue().getClass().getName());

        System.out.println(className2.getParam());
        System.out.println(className2.getParam().getClass().getName());
        System.out.println(className2.getValue());
        System.out.println(className2.getValue().getClass().getName());

        System.out.println(className.generic("Hello").getClass().getName());
        System.out.println(className.generic(3).getClass().getName());
        System.out.println(className.generic(className2).getClass().getName());


    }
}

