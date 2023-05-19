// 어댑터 클래스
public class MediaPlayerAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            advancedMediaPlayer.playMp3(fileName);
        } else {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
