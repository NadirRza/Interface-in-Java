package Task4;

public class AmphibiousPlane implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("Amphibious flying");
    }

    @Override
    public void swim() {
        System.out.println("Amphibious swimming");

    }
}
