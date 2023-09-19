/*Konstruktori
*
* konstruktor se koristi kod kreiranja objekta, koji je instanca(primjer) klase
* to je specijalan tip koda koji ima specifična imena i parametre, slično kao metoda.
* ima isto ime kao i klasa, ali nema return vrijednost
* Bilo bi poželjno specifirati prikladni pristupni modifikato, kako bi kontrolirati tko može kreirati novu instancu klase
* primjer konstruktora: public Account(){
*                        //ima isto ime kao klasa
*                       }
*
* ______Constructor overloading_________
* "preopterečenje" konstruktora je deklariranje više konstruktora sa različitim paramterima
* broj parametara može biti različiti između konstruktora
* ako je broj parametara isti između dva konstruktora, njihovi tipovi ili redoslijed mora biti različiti
*
* ______Constructor chaining with this()________
* kada jedan konstruktor eksplicitno zove drugog overloaded konstruktora
* konstruktor se može zvati iz drugog konstruktora
* mora se koristiti speciajalna izjava THIS() kako bi se izvršio drugi konstruktor
*
* this() mora biti prva izvedena izjava, ako se koristi iz drugoga konstruktora*/
public class Main {
    public static void main(String[] args) {

      //  bankAccount bankAccount = new bankAccount(123,200,"Matija", "mvrabelj@mail.com", "12356789");
        bankAccount bankAccount = new bankAccount();
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getAccountBalance());
        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getPhoneNumber());


       bankAccount.depositingFunds(200);
       bankAccount.withDrawingMoney(50);

       bankAccount MatijaAccount = new bankAccount("Matija", "mafija@mail.mafija", "mobilni" );
        System.out.println("AccountNo: " + MatijaAccount.getAccountNumber() +
                "; name " + MatijaAccount.getCustomerName() );

    }
}
