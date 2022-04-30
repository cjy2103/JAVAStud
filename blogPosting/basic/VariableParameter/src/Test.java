public class Test {

    public void sum (int... number){
        int sum = 0;
        for(int num : number){
            sum += num;
        }
        System.out.println(sum);
    }

    public void strmulti(String str, int...number){
        int sum = 1;
        for(int num : number){
            sum *= num;
        }
        System.out.println(str+sum);
    }




}
