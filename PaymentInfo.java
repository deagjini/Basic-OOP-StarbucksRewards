package starbucks;

public class PaymentInfo {
    private String cardNumber, CVV, expiryDate, cardName;

    public PaymentInfo(String cardNumber, String CVV, String expiryDate, String cardName) { 
        this.cardName = cardName; 
        this.cardNumber = cardNumber;
        this.CVV = CVV;
        this.expiryDate = expiryDate;
    } 

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCVV() {
        return CVV;
    }

    public String getExpiryDate() {
        return expiryDate;
    } 

    public String getCardName() {
        return cardName;
    }

    @Override
    public String toString() {
         String payment; 
         payment = "\n  Card Name:\t   " + cardName + "\n  Card #:\t   " + cardNumber + "\n  CVV:\t\t   " + CVV + "\n  ExpiryDate:\t   " + expiryDate; 
         return payment; 
    }

}

