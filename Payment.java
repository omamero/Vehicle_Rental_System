package Vehicle_Rental_System;

import java.time.LocalDate;

abstract public class Payment {
    private double totalAmount;
    private String currency;
    private LocalDate paymentDate; 

    public Payment(double totalAmount, String currency, LocalDate paymentDate) {
        this.totalAmount = totalAmount;
        this.currency = currency;
        this.paymentDate = paymentDate;
    }

    public void setTotalAmount(double amount) {
        this.totalAmount = amount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setPaymentDate(LocalDate date) { 
        this.paymentDate = date;
    }

    public LocalDate getPaymentDate() { 
        return paymentDate;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void processPayment() {
        // Process payment logic here
    }
}
