public class Customer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(){
       this("Matija", 100, "mvrabelj5@gmail.com");
    }

    public Customer(String name, String emailAddress) {
       this(name, 1000, emailAddress);//ovo je način pozivanja drugoga konstruktora u konstruktoru
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
