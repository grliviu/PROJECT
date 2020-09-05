package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Dog bobby = new Dog();
        System.out.println(bobby.name);
        Adoptor laura = new Adoptor();
        System.out.println(laura.name);
        laura.work();
        DogFood pedygree = new DogFood();
        System.out.println(pedygree.name);
        System.out.println(pedygree.price);
        Activity favoriteActivity = new Activity();
        System.out.println(favoriteActivity.name);
        Vet myVet = new Vet();
        System.out.println(myVet.name);

    }
}
