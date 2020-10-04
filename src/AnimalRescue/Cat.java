package AnimalRescue;

public class Cat extends Animal {


    public void purring() {
        System.out.println("Purring...");
    }
    public void catchingMise() {
        System.out.println("CatchingMise...");
    }


    public void eat() {
        System.out.println("Eats softly like a cat");
    }


    public void run() {
        System.out.println("Runs like a cat ");
    }


    public void sleep() {
        System.out.println("Sleeps very much");

    }

    @Override
    public void vocalisation() {
        System.out.println("Mew");
    }
}
