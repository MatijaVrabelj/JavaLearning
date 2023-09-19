/*klase mogu biti organizirane u logične grupe, pakete
* programer deklarira ime paketa u klasi korištenjem package statement
* ako ne deklariraš paket, klasa pripada default paketu
*_______________ACCESS MODIFIERS FOR THE CLASS_________________
* klasa je top kada je definirana u soruce code file, a ne zatvorena u bloku koda druge klase, tipa ili metode.
* public ili NONE(NIŠTA)
*  public -> bilo koja klasa bilo gdje može pristupiti ovoj klasi
* protected -> protected omogućuje da klase u istome paketu i podklase u drugome paketu da imaju pristup članu
* ništa/ -> moguć pristup klasama iz istoga paketa
* private -> nijedna klasa ne može pristupiti ovom članu
* ______________ENKAPSULACIJA___________________________________
* eklaspulacija obično u OOP-u ima dva značenja
* 1. građenje ponašanja i atributa u jednom objektu(klasi)
* 2. sakrivanja polja(fields) od neki metoda sa public pristupom
* Sama bit enkapsulacije jest da nedozvoljavamo pristup poljima(field) direktno
* ______________GETTERS AND SETTERS_____________________________
* Getter je metoda u klasi koja uzima vrijednost private polja(field) i vraća ga
* Setter je metoda u klasi koja postavlja vrijednost private polju(field)
* Svrha ovih metoda je kontrola, zaštita i pristup private poljima(fields)
*
 */

public class Car {
    private String make = "Tesla";
    private String model = "Model S";
    private String color = "White" ;
    private int doors = 5;
    private boolean convertible = false;

    public void describeCar(){
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : " "));
    }
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){
        if(make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "holden" , "porsche", "tesla" -> this.make = make;
            default ->
                this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
