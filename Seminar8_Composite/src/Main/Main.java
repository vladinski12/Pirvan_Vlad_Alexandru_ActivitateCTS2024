package Main;


import Models.Departament;
import Models.Sectie;
import Models.StructuraAbstracta;

// A8
public class Main {
    public static void main(String[] args) {
        StructuraAbstracta cardiologie = new Departament("Cardiologie", "Gigel");
        StructuraAbstracta oftalmologie = new Departament("Oftalmologie", "Vasile");

        StructuraAbstracta terapieIntensiva = new Sectie("ATI", 10, "Ion");
        StructuraAbstracta donareSange = new Sectie("Donare de sange", 5, "Gogu");
        StructuraAbstracta optometrie = new Sectie("Optometrie", 10, "Ionut");

        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donareSange);

        oftalmologie.adaugaStructura(optometrie);

        StructuraAbstracta spital = new Departament("Spital", "Ionescu");
        spital.adaugaStructura(cardiologie);
        spital.adaugaStructura(oftalmologie);

        spital.afiseazaDescriere("      ");
    }
}