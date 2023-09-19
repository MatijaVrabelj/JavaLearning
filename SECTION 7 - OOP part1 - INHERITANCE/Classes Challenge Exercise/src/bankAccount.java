public class bankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankAccount(){
        this(123456789, 10000000, "Matija Vrabelj", "mvrabelj5@gmail.com", "0998601878");//ovo je primjer
        //pozivanja konstruktora unutar konstruktora
        //kao što je navedeno, this se mora prvi izvesti kako bi to funkcioniralo
        System.out.println("Empty constructor called!");
    }
    public bankAccount(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called!");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public bankAccount(String customerName, String email, String phoneNumber) {
        this(999999, 100.55,customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void withDrawingMoney(double withDrawMoney){

        if(accountBalance - withDrawMoney < 0){
            System.out.println("Not enough founds.");
        }else
            accountBalance -=withDrawMoney;
            System.out.println("Remaining balance is " + accountBalance );

    }
    public void depositingFunds(double depositFunds){
        accountBalance += depositFunds;
        System.out.println("New account balance is " + accountBalance);
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
