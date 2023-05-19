// 클라이언트
public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerAdapter(new AdvancedMediaPlayer());

        mediaPlayer.play("mp3","music.mp3");
        mediaPlayer.play("mp4","movie.mp4");
    }
}