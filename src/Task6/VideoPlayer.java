package Task6;

public class VideoPlayer implements Playable {

    @Override
    public void defaultPlayMessage() {
        System.out.println("Playing video");
    }

    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.defaultPlayMessage();
    }
}
