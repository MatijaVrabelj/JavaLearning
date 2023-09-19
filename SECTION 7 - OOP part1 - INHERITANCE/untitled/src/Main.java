public class Main {
   public static void main(String[] args) {
        Customer customer =  new Customer();
        Customer customer1 = new Customer("Matija", 10000000, "ajsofjao");


       System.out.println(customer.getName());
       System.out.println(customer.getCreditLimit());
       System.out.println(customer.getEmailAddress());
       System.out.println("_____________________________");
       System.out.println(customer1.getName());
       System.out.println(customer1.getCreditLimit());
       System.out.println(customer1.getEmailAddress());
    }
}