package Task1;

public class Main {
    public static void main(String[] args) {
        MusicPlayer music = new MusicPlayer();
        VideoPlayer video = new VideoPlayer();
        music.play();
        music.stop();

        video.play();
        video.stop();
    }
}
