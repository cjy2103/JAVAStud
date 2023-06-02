// 클라이언트
public class Main {
    public static void main(String[] args) {
        // 클라이언트는 FileServiceProxy를 통해 파일 서비스에 접근한다
        FileService fileService = new FileServiceProxy();

        // 파일 서비스를 사용하여 파일을 업로드한다
        fileService.uploadFile("file.txt");

        // 파일 서비스를 사용하여 파일을 다운로드한다
        fileService.downloadFile("file.txt");
    }
}