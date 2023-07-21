// Leaf 클래스 : 파일을 나타내는 클래스
public class File implements FileSystemComponent{
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("File:" + name);
    }
}
