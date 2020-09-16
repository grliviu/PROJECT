package AnimalRescue;

public class Adoptor {
    private String name = "Laura";
    private double budget = 1234.5;

    public void work(){
        System.out.println("Going to work");
    }
    public void feed(){ System.out.println("Feeding my dog"); }
public String getNameA(){
        return name;
}
public void setNameA(String nameOfAdoptor){
        name=nameOfAdoptor;
}
public double getBudget (){
        return budget;

}
    public void setBudget(double moneyBudget){
        budget=moneyBudget;
    }

}
