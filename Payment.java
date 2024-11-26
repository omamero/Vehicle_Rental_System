package Vehicle_Rental_System;

import java.util.Date;

abstract public class Payment {
    private double totalAmount;
    private String currency;
    private Date paymentDate;

    public Payment(double totalAmount, String currency, Date paymentDate) {
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

    public void setPaymentDate(Date date) {
        this.paymentDate = date;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void processPayment() {
        
    }
}


