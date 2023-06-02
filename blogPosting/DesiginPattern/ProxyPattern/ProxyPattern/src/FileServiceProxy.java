// Proxy : 클라이언트와 실제 서비스 객체 사이에서 중개 역할을 하는 클래스
public class FileServiceProxy implements FileService{

    private FileService fileService;

    public FileServiceProxy() {
        fileService = new RemoteFileService();
    }

    @Override
    public void downloadFile(String fileName) {
        // 원격 서비스에 접근하기 전에 추가적인 로직을 수행할 수 있습니다.
        System.out.println("Proxy: Preparing to download file");

        // 실제 파일 서비스 객체의 메서드를 호출합니다.
        fileService.downloadFile(fileName);

        // 원격 서비스에 접근 후에 추가적인 로직을 수행할 수 있습니다.
        System.out.println("Proxy: Download completed");
    }

    @Override
    public void uploadFile(String fileName) {
        // 원격 서비스에 접근하기 전에 추가적인 로직을 수행할 수 있습니다.
        System.out.println("Proxy: Preparing to upload file");

        // 실제 파일 서비스 객체의 메서드를 호출합니다.
        fileService.uploadFile(fileName);

        // 원격 서비스에 접근 후에 추가적인 로직을 수행할 수 있습니다.
        System.out.println("Proxy: Upload completed");
    }
}
