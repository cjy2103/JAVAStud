public class DeleteFileCommand implements Command{

    private FileSystemReceiver fileSystemReceiver;

    public DeleteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.deleteFile();
    }
}
