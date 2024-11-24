package Vehicle_Rental_System;

import java.util.Date;

public class Credit extends Payment {
    private String cardNumber;
    private String nameOnCard;
    private String expireYear;
    private String expireMonth;
    private String CCV;

    public Credit(double totalAmount, String currency, Date paymentDate, String cardNumber, String nameOnCard, String expireYear, String expireMonth, String CCV) {
        super(totalAmount, currency, paymentDate);
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
        this.expireYear = expireYear;
        this.expireMonth = expireMonth;
        this.CCV = CCV;
    }

    public boolean isCardValid() {
        
        return true;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public void setExpireYear(String year) {
        this.expireYear = year;
    }

    public void setExpireMonth(String month) {
        this.expireMonth = month;
    }
}

