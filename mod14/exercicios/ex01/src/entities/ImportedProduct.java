package entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return this.customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return this.price += this.price * this.customsFee/100.0;
    }

    @Override
    public String priceTag(){
        return this.name + " $ " + this.totalPrice() + " (Customs fee: $ " + String.format("%.2f", this.customsFee) + ")";
    }


}
