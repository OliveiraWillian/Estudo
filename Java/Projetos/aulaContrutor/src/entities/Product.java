package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;

    }

    @Override
    public String toString() {
        // return "Product data : " +name +", $ "+price+", "+quantity+" units, Total: "+totalValueInStock() ;

        return String.format(" data : %s, $ %.2f, %d units, Total: %.2f %n", name, price, quantity, totalValueInStock());
    }
}
