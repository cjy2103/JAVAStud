public class Main {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int [] array2 = {10,9,8,7,6,5,4,3,2,1};
        int [] array3 = {5,6,2,3,6,1,4,9,10,7};

        Test test = new Test();
        test.searchMax(array);
        test.searchMin(array2);
        test.sortCase(array3);
        test.caseMethod(array3);
    }
}
