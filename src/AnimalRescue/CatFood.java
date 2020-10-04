package AnimalRescue;

public class CatFood extends Food {
    @Override
    public void isConsumed() {
        System.out.println("Cats eat small quantities of food");
    }

    @Override
    public void isRotting() {
        System.out.println("Most food is in cans");
    }
}
