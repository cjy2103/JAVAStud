public class Main {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            try{
                int num = 10;
                System.out.println(num/i);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}