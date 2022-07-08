public class Test {

    public void normalLoop(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }

    public void forEachLoop(){
        String[] strArry = new String[]{"사과","바나나","망고"};

        for(String str : strArry){
            System.out.println(str);
        }
    }

    public void whileLoop(){
        int i = 1;
        while (i<10){
            System.out.println(i++);
        }

        do{
            System.out.println(i--);
        } while (i>0);
    }
}
