package Main;

import Models.Fabrica.FabricaBrancardier;
import Models.Fabrica.FabricaInfirmier;
import Models.Fabrica.FabricaMedic;
import Models.Fabrica.FabricaPersonal;
import Models.PersonalSpital;

public class Main {
    public static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu) {
        PersonalSpital personalSpital = fabricaPersonal.createPersonal(nume, salariu);
        personalSpital.afisareDetalii();
    }

    public static void main(String[] args) {
        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaInfirmier = new FabricaInfirmier();
        FabricaPersonal fabricaBrancardier = new FabricaBrancardier();

        PersonalSpital medic = fabricaMedic.createPersonal("Vlad", 6000);
        PersonalSpital asistent = fabricaInfirmier.createPersonal("Alex", 5000);
        PersonalSpital brancardier = fabricaBrancardier.createPersonal("Andrei", 4000);

        prelucrarePersonal(fabricaMedic, "Vlad", 6000);
        prelucrarePersonal(fabricaInfirmier, "Alex", 5000);
    }
}