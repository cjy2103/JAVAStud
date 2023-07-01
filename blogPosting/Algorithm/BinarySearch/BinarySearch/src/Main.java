public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,7,59,3,19,47,17,11,23,41,53,37,29,43,13,31,5};
        int target = 37;
        BinarySearch binarySearch = new BinarySearch();
        int count = binarySearch.search(numbers,target);

        System.out.println("37을 찾기 위해 이분 탐색을 " + count + "번 수행했습니다.");

    }
}