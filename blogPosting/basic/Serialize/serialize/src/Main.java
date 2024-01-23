import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 객체생성
        Data data = new Data("Test");

        // 객체 파일 직렬화

        // 객체를 파일에 직렬화
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.ser"))) {
            out.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 파일에서 객체 역직렬화
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.ser"))) {
            Data newObj = (Data) in.readObject();
            System.out.println(newObj.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}