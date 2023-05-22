public class Main {
    public static void main(String[] args) {

        // Receiver 객체 생성
        FileSystemReceiver fileSystem = new FileSystemReceiver();

        // CreateFileCommand, DeleteFileCommand 객체 생성
        CreateFileCommand createFileCommand = new CreateFileCommand(fileSystem);
        DeleteFileCommand deleteFileCommand = new DeleteFileCommand(fileSystem);

        // Invoker 객체 생성 및 명령 설정
        FileInvoker fileInvoker = new FileInvoker(createFileCommand);

        // 파일 생성 명령 실행
        fileInvoker.execute();

        // 명령 변경 (파일 삭제)
        fileInvoker = new FileInvoker(deleteFileCommand);
        fileInvoker.execute();

    }
}