public class Dog extends Animal {
    public Dog()
    {

        //način pozivanja konstruktora iz roditeljske klase
                 //način je pozivanja konstruktora na super klasu iz roditeljske konstruktora
                 //kao i this(), mora biti prva izjava unutar konstruktora
                //this() i super() niakd ne smiju biti pozvani iz istoga konstruktora

        super("Mutt","large", 50);

    }
}
