public class Main {
    public static void main(String[] args) {
        Suv seltos = new Suv("���佺",2800);
        Suv sportage = new Suv("����Ƽ��",3600);

        if(seltos.compareTo(sportage) > 0){
            System.out.println(seltos.getName() + "�� " + sportage.getName()+"���� ��Դϴ�");
        } else if(seltos.compareTo(sportage) < 0){
            System.out.println(seltos.getName() + "�� " + sportage.getName()+"���� �Դϴ�");
        } else {
            System.out.println("�� ���� ������ �����ϴ�");
        }
    }

}
