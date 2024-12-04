package Task2;

public class Test implements AdvancedPlayable{
    @Override
    public void pause() {
        System.out.println("Pausing");
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }
}
