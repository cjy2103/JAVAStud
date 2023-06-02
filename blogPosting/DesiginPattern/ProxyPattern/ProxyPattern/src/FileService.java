//Subject : 클라이언트와 실제 서비스 객체 사이의 공통 인터페이스 역할
public interface FileService {
    void downloadFile(String fileName);
    void uploadFile(String fileName);
}
