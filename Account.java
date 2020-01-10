package starbucks;

import java.util.ArrayList;

public class Account {

    private String password, birthday, email;
    private PersonalInfo accountInfo, shippingInfo, billingInfo;
    private Membership membershipInfo;
    private ArrayList<OrderHistory> orders = new ArrayList<>(); //OrderHistory orderHistory;  
    private ArrayList<PaymentInfo> cards = new ArrayList<>();

    public Account(String password, String birthday, String email, PersonalInfo accountInfo, PersonalInfo shippingInfo, Membership membershipInfo, ArrayList<OrderHistory> orders, ArrayList<PaymentInfo> cards, PersonalInfo billingInfo) {
        this.password = password;
        this.birthday = birthday;
        this.email = email;
        this.accountInfo = accountInfo;
        this.shippingInfo = shippingInfo;
        this.billingInfo = billingInfo;
        this.membershipInfo = membershipInfo;
        this.orders = orders; 
        this.cards = cards;
    }

    public void setCards(ArrayList<PaymentInfo> cards) {
        this.cards = cards;
    }
 
    public Account(PersonalInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccountInfo(PersonalInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

    public void setShippingInfo(PersonalInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void setMembershipInfo(Membership membershipInfo) {
        this.membershipInfo = membershipInfo;
    }

    public void setOrders(ArrayList<OrderHistory> orders) {
        this.orders = orders;
    }
 
    public void setBillingInfo(PersonalInfo billingInfo) {
        this.billingInfo = billingInfo;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public PersonalInfo getAccountInfo() {
        return accountInfo;
    }

    public PersonalInfo getShippingInfo() {
        return shippingInfo;
    }

    public Membership getMembershipInfo() {
        return membershipInfo;
    }

    public ArrayList<OrderHistory> getOrders() { 
        return orders;
    }
  
    public PersonalInfo getBillingInfo() {
        return billingInfo;
    }

    public ArrayList<PaymentInfo> getCards() {   
        return cards;
    }

    public void updateAccountInfo(PersonalInfo x) {
        this.accountInfo = x;
    }

    public void updateShippingInfo(PersonalInfo x) {
        this.shippingInfo = x;
    }

    public void updateBillingInfo(PersonalInfo x) {
        this.billingInfo = x;
    }

    public void updateMembershipInfo(Membership x) {
        this.membershipInfo = x;
    }

    @Override
    public String toString() {
        String account; 
        int i = 1;
        account = "\n  Email:\t   " + email + "\n  Password:\t   " + password + "\n  Birthday:\t   " + birthday
                + "\n--Account Info--" + accountInfo
                + "\n--Membership Info--" + membershipInfo
                + "\n--Billing Info--" + billingInfo
                + "\n--Shipping Info--" + shippingInfo 
                + "\n--Order History--"; 
        
        for (OrderHistory x : orders) {
            account = account + "\nItem " + i + ". " + x; 
            i++;
        }
        
        account = account + "\n--Payment Info--";
        
        i = 1;
        for (PaymentInfo x : cards) {
            account = account + "\nCard " + i + ". " + x; 
            i++;
        }
        return account;
    }

    public boolean equals(Account o) {
        if (this.accountInfo.equals(o.getAccountInfo())) {
            return true;
        }
        return false;
    }

}
