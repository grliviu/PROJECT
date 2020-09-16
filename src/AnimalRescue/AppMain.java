package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Dog bobby = new Dog();
        bobby.setName("Koko");
        System.out.println(bobby.getName());
        bobby.setColor("brown");
        System.out.println(bobby.getColor());
        bobby.setAge(4.1f);
        System.out.println((bobby.getAge()));
        bobby.setWeight(13.1f);
        System.out.println(bobby.getWeight());
        bobby.setBreed("Saluki");
        System.out.println(bobby.getBreed());
        bobby.setIsMale(true);
        System.out.println(bobby.getIsmale());


        Adoptor laura= new Adoptor();
        laura.setNameA("Maria");
        System.out.println(laura.getNameA());
        laura.setBudget(2000);
        System.out.println(laura.getBudget());
        laura.work();

        DogFood pedygree = new DogFood();
        pedygree.setNameF("MancareDeCaini");
        System.out.println(pedygree.getNameF());
        System.out.println(pedygree.price);

        Activity favoriteActivity = new Activity();
        favoriteActivity.setName("running");
        System.out.println(favoriteActivity.getName());

       Vet myVet = new Vet();
        myVet.setNameV("Georgica");
       System.out.println(myVet.getNameV());
        myVet.setSpecialisation("nutrition");
        System.out.println(myVet.getSpecialisation());

    }
}
