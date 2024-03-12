import Models.Fabrica.FabricaAsistent;
import Models.Fabrica.FabricaBrancardier;
import Models.Fabrica.FabricaMedic;
import Models.Fabrica.FabricaPersonal;
import Models.PersonalSpital;

public class Main {
    public static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu) {
        PersonalSpital personal = fabricaPersonal.createPersonal(nume, salariu);
        personal.afisareDetalii();
    }

    public static void main(String[] args) {
//        PersonalSpital fabricaMedic = new FabricaMedic().createPersonal("Medic", 1000);
//        PersonalSpital fabricaAsistent = new FabricaAsistent().createPersonal("Asistent", 800);
//        PersonalSpital fabricaBrancardier = new FabricaBrancardier().createPersonal("Brancardier", 600);
//
//        fabricaMedic.afisareDetalii();
//        fabricaAsistent.afisareDetalii();
//        fabricaBrancardier.afisareDetalii();

        prelucrarePersonal(new FabricaMedic(), "Medic", 1000);
        prelucrarePersonal(new FabricaAsistent(), "Asistent", 800);
        prelucrarePersonal(new FabricaBrancardier(), "Brancardiwer", 600);
        prelucrarePersonal(new FabricaAsistent(), "Asistent", 800);
    }
}