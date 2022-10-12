public class TimeTest {

    public void timeTest(){
        long start = System.currentTimeMillis();
        long sum = 0;
        for(int i=0;i<200000;i++){
            for(int j=0;j<50000;j++){
                sum += j;
            }
        }

        long end = System.currentTimeMillis();

        long diff = (end - start);

        System.out.println("코드 실행시간:"+diff+"ms");

    }

    public void bigO(){
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int [] array : arr){
            for(int num : array){
                System.out.println(num);
            }
        }
    }
}
