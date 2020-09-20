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
        bobby.eat();

        Adoptor laura= new Adoptor();
        laura.setName("Maria");
        System.out.println(laura.getName());
        laura.setBudget(2000);
        System.out.println(laura.getBudget());


        DogFood pedygree = new DogFood();
        pedygree.setName("MancareDeCaini");
        System.out.println(pedygree.getName());

        Activity favoriteActivity = new Activity();
        favoriteActivity.setName("running");
        System.out.println(favoriteActivity.getName());

       Vet myVet = new Vet();
        myVet.setName("Georgica");
       System.out.println(myVet.getName());
        myVet.setSpecialisation("nutrition");
        System.out.println(myVet.getSpecialisation());

       Cat myCat = new Cat();
        myCat.setName("Felix");
       System.out.println(myCat.getName());

    }
}
