package AnimalRescue;

public class Hamster extends Animal {
    @Override
    public void eat() {
        System.out.println("Eating like a rodent");

    }

    @Override
    public void run() {
        System.out.println("Not such a good runner");

    }

    @Override
    public void sleep() {
        System.out.println("Short sleeping");

    }

    @Override
    public void vocalisation() {
        System.out.println("Making high frequency sounds");

    }
}
