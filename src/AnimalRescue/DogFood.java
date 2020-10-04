package AnimalRescue;

public class DogFood extends Food {

    @Override
    public void isConsumed() {
        System.out.println("Dogs eat more food than other animals ");

    }

    @Override
    public void isRotting() {
        System.out.println("Most of the food is dry");

    }
}
