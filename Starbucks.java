package starbucks;

import java.io.*;
import java.util.ArrayList;
/**
 * 
 * @author Dea Gjini
 */

public class Starbucks {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        ArrayList<Account> accounts = new ArrayList<Account>();

        //Account 1
        ArrayList<PaymentInfo> cards = new ArrayList<>();
        ArrayList<OrderHistory> orders = new ArrayList<>();
        PaymentInfo paymentInfo = new PaymentInfo("12339827289783", "345", "09/07", "Deaya Gjini");
        cards.add(paymentInfo);
        OrderHistory item = new OrderHistory(1.1, 1.1, 1); //work on theeese 
        orders.add(item);
        OrderHistory item1 = new OrderHistory(2.3, 4.5, 7);
        orders.add(item1);
        Membership membershipInfo = new Membership("Green", 0, 12.5, 16.3);
        PersonalInfo account = new PersonalInfo("Jenny", "Xu", "19 Grange Dr", "Richmond Hill", "L4E 4S9", "Ontario");
        PersonalInfo shipping = new PersonalInfo("Jenny", "Xu", "19 Grange Dr", "Richmond Hill", "L4E 4S9", "Ontario");
        PersonalInfo bill = new PersonalInfo("Jenny", "Xu", "19 Grange Dr", "Richmond Hill", "L4E 4S9", "Ontario");
        accounts.add(new Account("1234pilaf", "June 28 2001", "jenny.xu19@ycdsbk12.ca", account, shipping, membershipInfo, orders, cards, bill));

        //Account 2
        ArrayList<PaymentInfo> cards2 = new ArrayList<>();
        ArrayList<OrderHistory> orders2 = new ArrayList<>();
        PaymentInfo paymentInfo2 = new PaymentInfo("12339827289783", "345", "09/07", "Deaya Gjini");
        cards2.add(paymentInfo2);
        PaymentInfo pay = new PaymentInfo("11223344556", "696", "02/25", "Babi Gjini");
        cards2.add(pay);
        OrderHistory item2 = new OrderHistory(1.1, 1.1, 1);
        orders2.add(item2);
        Membership membershipInfo2 = new Membership("Gold", 1, 65, 189);
        PersonalInfo account2 = new PersonalInfo("Julia", "Liu", "230 Shaftsbury Ave", "Richmond Hill", "L6E 4J7", "Ontario");
        PersonalInfo shipping2 = account2;
        PersonalInfo bill2 = account2;
        accounts.add(new Account("julianumba1", "December 42 2019", "julia.liu19@ycdsbk12.ca", account2, shipping2, membershipInfo2, orders2, cards2, bill2));

        //Account 3
        ArrayList<PaymentInfo> cards3 = new ArrayList<>();
        ArrayList<OrderHistory> orders3 = new ArrayList<>();
        PaymentInfo paymentInfo3 = new PaymentInfo("23984973", "723", "01/18", "Dea Gjini");
        cards3.add(paymentInfo3);
        OrderHistory item3 = new OrderHistory(1.1, 1.1, 1);
        orders3.add(item3);
        Membership membershipInfo3 = new Membership("Gold", 0, 3, 111.7);
        PersonalInfo account3 = new PersonalInfo("Dea", "Gjini", "24 Hearthside Ave", "Richmond Hill", "L4E 4K2", "Ontario");
        PersonalInfo shipping3 = account3;
        PersonalInfo bill3 = account3;
        accounts.add(new Account("imaloser", "January 7 2018", "dea.gjini19@ycdsbk12.ca", account3, shipping3, membershipInfo3, orders3, cards3, bill3));

        menu(accounts);
    }

    /**
     * Menu display prompts for the user 
     * @param accounts
     */
    public static void menu(ArrayList<Account> accounts) throws IOException {
        int menu;
        do {
            System.out.println("Hello. What would you like to do?");
            System.out.println("1.   Display all customer information");
            System.out.println("2.   Search for a customer");

            menu = Integer.parseInt(input.readLine());
        } while (menu < 1 || menu > 2);
        switch (menu) {
            case 1:
                display(accounts);
                secondMenu(accounts);
                break;
            case 2:
                searchAccount(accounts);
                break;
            default:
                break;
        }
    }

    /**
     * Display displays the information in the accounts
     * @param accounts
     * @throws IOException 
     */
    public static void display(ArrayList<Account> accounts) throws IOException {
        int i = 1;
        for (Account x : accounts) { //advanced for loop that simplifies things. first 'PI' is class/datatype, 'x' is index, 'accounts' name of accounts
            System.out.println("\nAccount " + i + ". " + x.toString());
            i++;
        }

    }

    /**
     * secondMenu is the second menu that displays more propmts for the user
     * @param accounts
     * @throws IOException 
     */
    public static void secondMenu(ArrayList<Account> accounts) throws IOException {
        int menu;
        do {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1.   Add a customer");
            System.out.println("2.   Remove a customer");
            System.out.println("3.   Edit a customer's information");
            menu = Integer.parseInt(input.readLine());
        } while (menu < 1 || menu > 3);

        switch (menu) {
            case 1:
                addAccount(accounts);
                break;
            case 2:
                removeAccount(accounts);
                break;
            case 3:
                editAccount(accounts);
                break;
            default:
                break;
        }
        
    }
    
    

    /**
     * addAccount lets the user add a new account from scratch 
     * @param accounts
     * @throws IOException 
     */
    public static void addAccount(ArrayList<Account> accounts) throws IOException {
        String firstName, lastName, password, street, city, province, postalCode, email, bday, cardNumber, CVV, expiryDate, cardName;
        PersonalInfo shipping, billing;
        int option, choice = 0;
        ArrayList<PaymentInfo> cards = new ArrayList<>();
        ArrayList<OrderHistory> orders = new ArrayList<>();

        System.out.print("\nEnter a first name: ");
        firstName = input.readLine();
        System.out.print("Enter a last name: ");
        lastName = input.readLine();
        System.out.print("Enter an email: ");
        email = input.readLine();
        System.out.print("Enter a password: ");
        password = input.readLine();
        System.out.print("Enter a birthday [dd/mm/yy]: ");
        bday = input.readLine();

        System.out.println("\n------Address Info------");
        System.out.print("Enter the street: ");
        street = input.readLine();
        System.out.print("Enter the city: ");
        city = input.readLine();
        System.out.print("Enter the postal code: ");
        postalCode = input.readLine();
        System.out.print("Enter the province: ");
        province = input.readLine();
        PersonalInfo account = new PersonalInfo(firstName, lastName, street, city, postalCode, province);

        System.out.print("\nIs the shipping address the same as the address above? [Enter '1' for yes, anything else for no]: ");
        option = Integer.parseInt(input.readLine());
        if (option == 1) {
            shipping = new PersonalInfo(firstName, lastName, street, city, postalCode, province);
        } else {
            System.out.println("------Shipping Address Info------");
            System.out.print("Enter a first name: ");
            firstName = input.readLine();
            System.out.print("Enter a last name: ");
            lastName = input.readLine();
            System.out.print("Enter the street: ");
            street = input.readLine();
            System.out.print("Enter the city: ");
            city = input.readLine();
            System.out.print("Enter the postal code: ");
            postalCode = input.readLine();
            System.out.print("Enter the province: ");
            province = input.readLine();
            shipping = new PersonalInfo(firstName, lastName, street, city, postalCode, province);
        }

        do {
            choice = 0;
            System.out.println("------Card Information------");
            System.out.print("Enter name on card: ");
            cardName = input.readLine();
            System.out.print("Enter card number: ");
            cardNumber = input.readLine();
            System.out.print("Enter CVV: ");
            CVV = input.readLine();
            System.out.print("Enter expiry date [mm/yy]: ");
            expiryDate = input.readLine();

            PaymentInfo card = new PaymentInfo(cardNumber, CVV, expiryDate, cardName);
            cards.add(card);

            do {
                System.out.println("Would you like to add another card? \nPress 1 for yes and 2 for no");
                choice = Integer.parseInt(input.readLine());
            } while (choice < 1 || choice > 2);

        } while (choice == 1);

        System.out.println("\nEnter the appropriate number.");
        System.out.println("1. Billing address is the same as personal address");
        if (option != 1) {
            System.out.println("2. Billing address is the same as shipping address");
        }
        System.out.println("3. Billing address is different");
        option = Integer.parseInt(input.readLine());

        if (option == 1) {
            billing = account;
        } else if (option == 2) {
            billing = shipping;
        } else {
            System.out.println("------Billing Address Info------");
            System.out.print("Enter a first name: ");
            firstName = input.readLine();
            System.out.print("Enter a last name: ");
            lastName = input.readLine();
            System.out.print("Enter the street: ");
            street = input.readLine();
            System.out.print("Enter the city: ");
            city = input.readLine();
            System.out.print("Enter the postal code: ");
            postalCode = input.readLine();
            System.out.print("Enter the province: ");
            province = input.readLine();
            billing = new PersonalInfo(firstName, lastName, street, city, postalCode, province);
        }

        Membership membershipInfo = new Membership("Green", 0, 0, 0);

        accounts.add(new Account(password, bday, email, account, shipping, membershipInfo, orders, cards, billing));

        display(accounts);
        backPrompt(accounts);
    }

    /**
     * removeAccout lets the user remove an account from the account arraylist
     * @param accounts
     * @throws IOException 
     */
    public static void removeAccount(ArrayList<Account> accounts) throws IOException {
        int choice = 0;
        do {
            System.out.println("Which account would you like to delete?: ");
            choice = Integer.parseInt(input.readLine());
        } while (choice < 1 || choice > accounts.size());

        accounts.remove(choice - 1);
        display(accounts);

        backPrompt(accounts);
    }

    /**
     * searchAccount lets the user search for an account using the first name and last name 
     * @param accounts
     * @throws IOException 
     */
    public static void searchAccount(ArrayList<Account> accounts) throws IOException {
        String firstName, surName;
        int check = 0;

        System.out.println("\nEnter the first name and the last name of the account you wish to find");
        System.out.print("First name: ");
        firstName = input.readLine();
        System.out.print("Last name: ");
        surName = input.readLine();

        PersonalInfo accountInfo = new PersonalInfo(firstName, surName);
        Account search = new Account(accountInfo);

        for (Account x : accounts) {

            if (search.equals(x)) {
                System.out.print("\nIts a match! Here is your account: " + x);
                check = 2;
                break;
            }
        }

        if (check != 2) {
            System.out.println("\nThis ain't it chief");
        }

        backPrompt(accounts);

    }

    /**
     * editAccount lets the user edit different aspects of the account
     * @param accounts
     * @throws IOException 
     */
    public static void editAccount(ArrayList<Account> accounts) throws IOException {
        int choice = 0, choice1 = 0, choice2 = 0, addOrRemove = 0, pick = 0, i = 1;
        String cardName, CVV, cardNumber, expiryDate;
        Account account;
        do {
            System.out.println("Which account would you like to edit?: ");
            choice = Integer.parseInt(input.readLine());
        } while (choice < 1 || choice > accounts.size());

        account = accounts.get(choice - 1);
        System.out.println(account);

        do {
            System.out.println("\nWhat would you like to edit?");
            System.out.println("1.   Personal Information");
            System.out.println("2.   Shipping Information");
            System.out.println("3.   Order History");
            System.out.println("4.   Payment Information");
            System.out.println("5.   Billing Information");
            System.out.println("6.   Membership Information");
            System.out.println("7.   Password or Email");
            choice1 = Integer.parseInt(input.readLine());
        } while (choice1 < 1 || choice1 > 7);

        if (choice1 == 1) {
            System.out.println(account.getAccountInfo());
            PersonalInfo x = account.getAccountInfo();

            System.out.println("Enter the new name: ");
            String name = input.readLine();
            x.setFirstName(name);
            System.out.println("Enter the surname: ");
            String surname = input.readLine();
            x.setLastName(surname);
            System.out.println("Enter the address line: ");
            String address = input.readLine();
            x.setAddressLine(address);
            System.out.println("Enter the city: ");
            String city = input.readLine();
            x.setCity(city);
            System.out.println("Enter the postal code: ");
            String postal = input.readLine();
            x.setPostalCode(postal);
            System.out.println("Enter the province: ");
            String prov = input.readLine();
            x.setProvince(prov);
            account.updateAccountInfo(x);
            System.out.println("Here is your updated accout: " + account);

        } else if (choice1 == 2) { //shipping info: type of personalInfo
            System.out.println(account.getShippingInfo());
            PersonalInfo x = account.getShippingInfo();

            System.out.println("Enter the new name: ");
            String name = input.readLine();
            x.setFirstName(name);
            System.out.println("Enter the surname: ");
            String surname = input.readLine();
            x.setLastName(surname);
            System.out.println("Enter the address line: ");
            String address = input.readLine();
            x.setAddressLine(address);
            System.out.println("Enter the city: ");
            String city = input.readLine();
            x.setCity(city);
            System.out.println("Enter the postal code: ");
            String postal = input.readLine();
            x.setPostalCode(postal);
            System.out.println("Enter the province: ");
            String prov = input.readLine();
            x.setProvince(prov);
            account.updateShippingInfo(x);
        } else if (choice1 == 3) {
            for (OrderHistory x : account.getOrders()) {
                System.out.println("\nItem " + i + ". " + x);
                i++;
            }
            do { 
                System.out.println("Would you like to remove or add an item? \nPress 1 for remove and 2 for add.");
                addOrRemove = Integer.parseInt(input.readLine());
            } while (addOrRemove != 1 && addOrRemove != 2); 
            
            if (addOrRemove == 1){ 
                do {
                    System.out.print("Which item would you like to remove?");
                    pick = Integer.parseInt(input.readLine());
                } while (pick < 1 || pick > account.getOrders().size());

                account.getOrders().remove(pick - 1);
            } else {
                do {
                    System.out.println("------Order History------");
                    System.out.print("Enter stars earned: ");
                    double starsEarned = Double.parseDouble(input.readLine());
                    System.out.print("Enter the order cost: ");
                    double orderCost = Double.parseDouble(input.readLine());
                    System.out.print("Enter order month: ");
                    int orderMonth = Integer.parseInt(input.readLine());

                    OrderHistory order = new OrderHistory (starsEarned, orderCost, orderMonth);
                    account.getOrders().add(order);
                    do {
                        System.out.println("Would you like to add another item? \nPress 1 for yes and 2 for no");
                        pick = Integer.parseInt(input.readLine());
                    } while (pick < 1 || pick > 2);
                } while (pick == 1);
            }

        } else if (choice1 == 4) {
            i = 1;
            for (PaymentInfo x : account.getCards()) {
                System.out.println("\nCard " + i + ". " + x);
                i++;
            } 
            addOrRemove = 0; 
            do {
                System.out.println("Would you like to remove or add a card? \nPress 1 for remove and 2 for add.");
                addOrRemove = Integer.parseInt(input.readLine());
            } while (addOrRemove != 1 && addOrRemove != 2);

            if (addOrRemove == 1) {
                do { 
                    pick = 0; 
                    System.out.print("Which card would you like to remove?");
                    pick = Integer.parseInt(input.readLine());
                } while (pick < 1 || pick > account.getCards().size());

                account.getCards().remove(pick - 1);
            } else {
                do {
                    System.out.println("------Card Information------");
                    System.out.print("Enter name on card: ");
                    cardName = input.readLine();
                    System.out.print("Enter card number: ");
                    cardNumber = input.readLine();
                    System.out.print("Enter CVV: ");
                    CVV = input.readLine();
                    System.out.print("Enter expiry date [mm/yy]: ");
                    expiryDate = input.readLine();

                    PaymentInfo paymentInfo = new PaymentInfo(cardNumber, CVV, expiryDate, cardName);
                    account.getCards().add(paymentInfo);
                    do {
                        System.out.println("Would you like to add another card? \nPress 1 for yes and 2 for no");
                        pick = Integer.parseInt(input.readLine());
                    } while (pick < 1 || pick > 2);
                } while (pick == 1);
            }

        } else if (choice1 == 5) {
            System.out.println(account.getBillingInfo());
            PersonalInfo x = account.getBillingInfo();

            System.out.println("Enter the new name: ");
            String name = input.readLine();
            x.setFirstName(name);
            System.out.println("Enter the surname: ");
            String surname = input.readLine();
            x.setLastName(surname);
            System.out.println("Enter the address line: ");
            String address = input.readLine();
            x.setAddressLine(address);
            System.out.println("Enter the city: ");
            String city = input.readLine();
            x.setCity(city);
            System.out.println("Enter the postal code: ");
            String postal = input.readLine();
            x.setPostalCode(postal);
            System.out.println("Enter the province: ");
            String prov = input.readLine();
            x.setProvince(prov);
            account.updateBillingInfo(x);

        } else if (choice1 == 6) {
            Membership x = account.getMembershipInfo();
            System.out.println(x);

            System.out.println("Enter the new status: ");
            String status = input.readLine();
            x.setStatus(status);
            System.out.println("Enter the reward amount: ");
            int reward = Integer.parseInt(input.readLine());
            x.setReward(reward);
            System.out.println("Enter the amount of expiring stars: ");
            double exstars = Double.parseDouble(input.readLine());
            x.setExpiringStars(exstars);
            System.out.println("Enter the amount of stars: ");
            double stars = Double.parseDouble(input.readLine());
            x.setStars(stars);
            account.updateMembershipInfo(x);

        } else if (choice1 == 7) {
            System.out.println("Email: " + account.getEmail());
            System.out.println("Password: " + account.getPassword());
            do {
                System.out.println("Would you like to edit the email or password? \nEnter 1 for email and 2 for password");
                choice2 = Integer.parseInt(input.readLine());
            } while (choice2 < 1 || choice2 > 2);
            if (choice2 == 1) {
                System.out.println("Enter the new email: ");
                String email = input.readLine();
                account.setEmail(email);
            } else {
                System.out.println("Enter the new password: ");
                String password = input.readLine();
                account.setPassword(password);
            }
        }

        System.out.println("Here is your updated account: " + account);
        backPrompt(accounts);

    }

    /**
     * backPrompt is shown after the user has completed a task (ex, they removed an account) and asks the user if they would like to return to the main menu to complete a different task
     * @param accounts
     * @throws IOException 
     */
    public static void backPrompt(ArrayList<Account> accounts) throws IOException {
        int choice3 = 0;
        do {
            System.out.println("Would you like to go back to the main menu? \nPress 1 for yes and 2 for no");
            choice3 = Integer.parseInt(input.readLine());
        } while (choice3 != 1 && choice3 != 2);
        if (choice3 == 1) {
            menu(accounts);
        }

    }
}
