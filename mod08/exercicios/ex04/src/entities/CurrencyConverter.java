package entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double amount){
        double totalDolar = dollarPrice * amount;
        return totalDolar + (totalDolar * IOF);
    }
}
