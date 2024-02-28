package model.services;


import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

    OnlinePaymentService service;

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }
    
    public void processContract(Contract contract, Integer months) {
        
        double total = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            total += service.interest(total, i);
            total += service.paymentFee(total);
            contract.addInstallment(new Installment(contract.getDate().plusMonths(i), total));
        }

    }

}
