public class SplitTest {
    // # �ڸ���
    public void test(){
        String str = "He#ll#o";
        String[] array = str.split("#");
        for(String arrStr : array){
            System.out.println(arrStr);
        }
        System.out.println("===========================");
    }

    // ��ǥ �ڸ���
    public void test2(){
        String str = "��,��.��.��,��,��";
        String[] array = str.split(",");
        for(String arrStr : array){
            System.out.println(arrStr);
        }
        System.out.println("===========================");
    }

    // ���� �ڸ���
    public void test3(){
        String str = "Split ���� ���� �ڸ��� �׽�Ʈ";
        String[] array = str.split(" ");
        for(String arrStr : array){
            System.out.println(arrStr);
        }
    }
}
