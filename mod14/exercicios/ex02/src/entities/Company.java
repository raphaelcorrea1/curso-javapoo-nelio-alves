package entities;

public class Company extends TaxPayer {

    private int numberofEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, int numberofEmployees) {
        super(name, anualIncome);
        this.numberofEmployees = numberofEmployees;
    }

    public int getNumberofEmployees() {
        return this.numberofEmployees;
    }

    public void setNumberofEmployees(int numberofEmployees) {
        this.numberofEmployees = numberofEmployees;
    }

    @Override
    public double tax() {
        if(this.numberofEmployees > 10){
            return this.getAnualIncome() * 0.14;
        } else {
            return this.getAnualIncome() * 0.16;
        }
    }

}
