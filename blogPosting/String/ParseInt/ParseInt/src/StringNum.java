public class StringNum {

    public int parse(String... str){
        int result = 0;
        for(String num : str){
            result += Integer.parseInt(num);
        }
        return result;
    }
}
