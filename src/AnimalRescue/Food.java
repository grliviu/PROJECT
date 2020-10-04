package AnimalRescue;

public abstract class Food {

    private String name;
    private double price;
    private double quantity;
    private boolean inStock;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return this.price;
    }

    public void setName(double price) {
        this.price = price;
    }
    public double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public boolean getInStock() {
        return this.inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public abstract void isConsumed ();
    public abstract void isRotting();


}
