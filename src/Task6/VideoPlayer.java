package Task1;

public class VideoPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Video play");
    }

    @Override
    public void stop() {
        System.out.println("Video stop");

    }
}
