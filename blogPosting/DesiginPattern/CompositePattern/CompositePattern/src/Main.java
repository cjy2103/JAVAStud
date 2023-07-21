public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Folder folder1 = new Folder("Folder1");
        File file3 = new File("file3.txt");
        File file4 = new File("file4.txt");
        Folder folder2 = new Folder("Folder2");

        // 폴더에 파일 추가
        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder2.addComponent(file3);
        folder2.addComponent(file4);

        // 더 깊은 폴더 구조 생성
        folder1.addComponent(folder2);

        // 파일 시스템 전체 정보 출력
        folder1.showInfo();
    }
}