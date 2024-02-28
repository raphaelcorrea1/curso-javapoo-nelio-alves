package model.services;

public class PaypalService implements OnlinePaymentService{


    public PaypalService() {
    }
    
    @Override
    public Double interest(Double amount, Integer months) {
        return amount * (months/100.0);
        
    }
    
    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }

}

