package Task1;

public class MusicPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Music play");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
