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
//     * 익명 객체로 넘겨주기
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
     * 람다 방식으로 넘겨주기
     */
    public void start(){
        CountNumber countNumber = new CountNumber(count -> System.out.print(count+"-"));
        countNumber.count();
    }


}
