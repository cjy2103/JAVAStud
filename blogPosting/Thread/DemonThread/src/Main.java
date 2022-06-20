public class Main {
    public static void main(String[] args) {
        Daemon daemon = new Daemon();
        Daemon daemon2 = new Daemon();

        daemon.setDaemon(true);
        daemon.start();
        daemon2.start();
    }
}
