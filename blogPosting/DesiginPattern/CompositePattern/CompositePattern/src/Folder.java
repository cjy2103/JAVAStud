import java.util.ArrayList;
import java.util.List;

// Composite 클래스 : 폴더를 나타내는 클래스
public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components;

    public Folder(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component){
        components.add(component);
    }
    @Override
    public void showInfo() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components){
            component.showInfo();
        }
    }
}
