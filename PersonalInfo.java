package starbucks;

public class PersonalInfo {
    private String firstName, lastName, addressLine, city, postalCode, province;


    
    public PersonalInfo(String firstName, String lastName, String addressLine, String city, String postalCode, String province) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLine = addressLine;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
    } 

    public PersonalInfo(String firstName, String lastName) { 
        this.firstName = firstName;
        this.lastName = lastName;
         this.addressLine = "";
        this.city = "";
        this.postalCode = "";
        this.province = "";
    }
    
    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getProvince() {
        return province;
    } 

    @Override
    public String toString() {
        String account; 
        account = "\n  FirstName:\t   " + firstName + "\n  Surname:\t   " + lastName + "\n  Address Line:\t   " + addressLine + "\n  City:\t\t   "
                + city + "\n  Postal Code:\t   " + postalCode + "\n  Province:\t   " + province;
        return account;
    }    
    
    public boolean equals(PersonalInfo o) {
        if (this.firstName.equalsIgnoreCase(o.getFirstName()) && this.lastName.equalsIgnoreCase(o.getLastName())){
            return true; 
        }
        return false; 
    } 
}

