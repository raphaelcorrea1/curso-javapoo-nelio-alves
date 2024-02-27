package entities;

public class OrderItem {

    private int quantity;
    private double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return this.product;
    }

    public double subTotal(){
        return this.quantity * this.price;
    }

    public String toString(){
        return this.getProduct().getName() + 
            ", $" + this.getProduct().getPrice() +
            ", Quantity: " + this.getQuantity() +
            ", Subtotal: $" + String.format("%.2f", this.subTotal());
    }

}
