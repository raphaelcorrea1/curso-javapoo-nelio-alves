package entities;

public class Individual extends TaxPayer {

    private double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return this.healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
		if (this.getAnualIncome() < 20000.0) {
			return this.getAnualIncome() * 0.15 - this.healthExpenditures * 0.5;
		}
		else {
			return this.getAnualIncome() * 0.25 - this.healthExpenditures * 0.5;
		}
    }


}
