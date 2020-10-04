package AnimalRescue;

public abstract class Human {
    private String name ;
    private double budget;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(double budget){
        this.budget=budget;
    }

    public abstract void work();
    public abstract void sleep();
    public abstract void speak();
}
