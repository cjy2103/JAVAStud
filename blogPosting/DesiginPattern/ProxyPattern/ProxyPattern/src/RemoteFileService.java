// RealSubject : 실제 파일 서비스를 구현하는 클래스
public class RemoteFileService implements FileService{
    @Override
    public void downloadFile(String fileName) {
        // 원격 서버에서 파일 다운로드 로직
        System.out.println("Downloading file: " + fileName);
    }

    @Override
    public void uploadFile(String fileName) {
        // 원격 서버에 파일 업로드 로직
        System.out.println("Uploading file: " + fileName);
    }
}
