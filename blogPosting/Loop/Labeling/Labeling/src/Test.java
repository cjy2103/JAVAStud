public class Test {
    public void normal(){
        boolean isBreak = false;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(isBreak){
                    break;
                }
                if(i == 2 && j == 2){
                    isBreak = true;
                    break;
                }
                System.out.printf(
                        """
                        i의 값 : %d, j의 값 : %d
                        """, i, j);
            }
        }
        System.out.println("Loop 종료");
    }

    public void labelingLoop(){
        outer : for(int i=0;i<5;i++){
            inner : for(int j=0;j<5;j++){
                if(i == 2 && j == 2) {
                    break outer;
                }
                System.out.printf(
                        """
                        i의 값 : %d, j의 값 : %d
                        """, i, j);
            }
        }
        System.out.println("Loop 종료");
    }
}
