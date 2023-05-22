public class CreateFileCommand implements Command{

    private FileSystemReceiver fileSystemReceiver;

    public CreateFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.createFile();
    }
}
