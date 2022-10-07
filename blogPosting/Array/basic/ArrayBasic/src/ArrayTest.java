import java.util.Arrays;

public class ArrayTest {

    public void oneDimensionalArray(){
        int [] array = new int[3]; // 길이가 3인 int 형 배열 선언
        int [] array2 = new int[3]; // 길이가 3인 int 형 배열 선언

        String [] season = {"봄","여름","가을","겨울"}; // String 배열 선언과 동시에 초기화

        array[0] = 5; // 인덱스를 이용해 배열 초기화
        array[1] = 2;
        array[2] = 3;

        for (int i : array) { // 배열의 값 출력
            System.out.println(i);
        }

        for(int i=0;i<array2.length;i++){ // loop문을 이용해 배열 초기화
            array2[i] = i;
            System.out.println(array2[i]);
        }

        for(String str : season) { // 배열의 값 출력
            System.out.println(str);
        }

        System.out.println(Arrays.toString(season));

    }

    public void multiDimensionalArray(){
        String [][] car = new String[3][3];
        String [] suv = {"스포티지","투싼","쏘렌토"};
        String [] sedan = {"그랜저","소나타","k5"};
        String [] RV = {"레이","스타리아","카니발"};

        for(int i=0;i<car.length;i++){
            for(int j=0;j<car[i].length;j++){
                switch (i){
                    case 0 -> car[i][j] = suv[j];
                    case 1 -> car[i][j] = sedan[j];
                    case 2 -> car[i][j] = RV[j];
                }
            }
        }

    System.out.println(Arrays.deepToString(car));

    }
}
