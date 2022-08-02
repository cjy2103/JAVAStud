public class Main {
    public static void main(String[] args) {
        Suv seltos = new Suv("셀토스",2800);
        Suv sportage = new Suv("스포티지",3600);

        if(seltos.compareTo(sportage) > 0){
            System.out.println(seltos.getName() + "가 " + sportage.getName()+"보다 비쌉니다");
        } else if(seltos.compareTo(sportage) < 0){
            System.out.println(seltos.getName() + "가 " + sportage.getName()+"보다 쌉니다");
        } else {
            System.out.println("두 차량 가격이 같습니다");
        }
    }

}
