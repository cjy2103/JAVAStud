public class SubString {

    // ��ü������ ������ 3�κи� ���
    public void subStringTest(){
        String str = "Hello";
        String result = str.substring(str.length()-3);
        System.out.println(result);
    }

    // Ư������ ������ ���ڿ� ���
    public void subStringTest2(){
        String str = "Hello/World";
        String result = str.substring(str.lastIndexOf("/")+1);
        System.out.println(result);
    }

    // Ư���ܾ� �κи� ���
    public void subStringTest3(){
        String str = "����Ƽ�� : 3600����, �䷹�� 3400����, ���� : 3500����";
        String target = "�䷹��";
        int targetNum = str.indexOf(target);
        String result = str.substring(targetNum,(str.substring(targetNum).indexOf("��") + targetNum));
        System.out.println(result);
    }

}



//        System.out.println(targetNum);
//        System.out.println(str.substring(targetNum).indexOf("��"));