//public class EventPrinter implements EventListener {
public class EventPrinter {

//    @Override
//    public void onEvent(int count) {
//        System.out.print(count+"-");
//    }

//    public void start(){
//        CountNumber countNumber = new CountNumber(this);
//        countNumber.count();
//    }

//    /**
//     * �͸� ��ü�� �Ѱ��ֱ�
//     */
//    public void start(){
//        CountNumber countNumber = new CountNumber(new EventListener() {
//            @Override
//            public void onEvent(int count) {
//                System.out.print(count+"-");
//            }
//        });
//        countNumber.count();
//    }



    /**
     * ���� ������� �Ѱ��ֱ�
     */
    public void start(){
        CountNumber countNumber = new CountNumber(count -> System.out.print(count+"-"));
        countNumber.count();
    }


}
