package model.entities;

import model.exceptions.BusinessException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance; 
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount) throws BusinessException {
        validateWithdraw(amount);
        this.balance -= amount;
    }

    private void validateWithdraw(Double amount) throws BusinessException{
        if(amount > this.withdrawLimit){
            throw new BusinessException("The amount exceeds withdraw limit");
        }

        if(this.balance <= 0 || this.balance < amount){
            throw new BusinessException("Not enough balance");
        }
    }


}
