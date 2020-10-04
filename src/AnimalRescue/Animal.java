package AnimalRescue;

public abstract class Animal {
    private String name ;
    private String color ;
    private float age ;
    private float weight ;
    private String breed  ;
    private boolean isMale ;
    public boolean getIsmale(){
        return this.isMale;
    }
    public void setIsMale(boolean isMale){
        this.isMale=isMale;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
       this.name=name;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public float getAge(){
        return this.age;
    }
    public void setAge(float age){
        this.age=age;
    }
    public float getWeight(){
        return this.weight;

    }
    public void setWeight(float weight){
        this.weight=weight;
    }
    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed=breed;
    }

    public abstract void eat();

    public abstract void run();

    public abstract void sleep();

    public abstract void vocalisation();


}
