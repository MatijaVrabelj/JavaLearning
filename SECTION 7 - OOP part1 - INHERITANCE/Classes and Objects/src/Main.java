/*Objektno orjentirano programiranje je način kako bi stvarne objekte prikazali kao softverske, koji sadržavaju i podatke i kod.
 *class based programming počinje sa klasama koji postaju ocrti za objekte.
 * objekti su ključni kako bi razumjeli objektno orjentirano programiranje
 * stvarni objekti imaju dva stanja: state i behavior
 * state (computer): količina RAM-a, operacijski sus., veličina HDD-a,...
 * state (mrav): godine, broj nogu, svijest, budan ili spava
 * Behavior(computer): booting up, shutting down, beeping, some sort of output
 * behavior (mrav): eating, drinking, fighting,...
 * modeliranje stvarnih objekata kao softverskih je nužna stvar u oop
 * softverske objekte pohranjujemo u polja(fields), koje možemo i nazvati varijable ili atributi
 * ___________________________________________________________________________________________
 * class opisuje podatke(fields) i ponašanje(methods), koje su bitni stvarnim objektima koje opisujemo
 * ako je polje(field) static, postoji samo jedna kopija u memoriji, njezina vrijednost(value) povezana je sa klasom.
 * ako nije static onda možemo mjenjati vrijednosti tim poljima(field)
 *
 *
 * */


public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Panamera");
        car.setDoors(5);
        car.setConvertible(false);
        car.setColor("Red");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Prosche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("Red");

        targa.describeCar();
    }
}
