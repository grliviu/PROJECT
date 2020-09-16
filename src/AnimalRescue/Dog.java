package AnimalRescue;

public class Dog {

   private String name = "Bobby";
   private String color = "white";
   private float age = 1.2f;
   private float weight = 12f;
   private String breed = "German sheppard";
    private boolean isMale = false;
    int health = 8;
    int hungry = 4;
    int happy = 10;
    String activity = "Swimming";
    String food = "Bones";
public boolean getIsmale(){
    return isMale;
}
    public void setIsMale(boolean sexOfDog){
    isMale=sexOfDog;
    }

    public String getName(){
        return name;
    }
    public void setName(String nameOfDog){
        name=nameOfDog;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String colorOfDog){
        color=colorOfDog;
    }
    public float getAge(){
        return age;
}
    public void setAge(float ageOfDog){
        age=ageOfDog;
}
    public float getWeight(){
        return weight;

}
    public void setWeight(float massOfDog){
        weight=massOfDog;
    }
    public String getBreed(){
        return breed;
}

    public void setBreed(String dogBreed) {
        breed =dogBreed;
    }





    public void eat() {
        System.out.println("Eating...");
    }

    public void run() {
        System.out.println("Running ...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void barking() {
        System.out.println("Barking...");
    }


}













