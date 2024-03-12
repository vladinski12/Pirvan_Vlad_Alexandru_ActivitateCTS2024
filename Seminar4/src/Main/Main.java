package Main;

import Models.Fabrica.FabricaPersonal;
import Models.Fabrica.TipPersonal;
import Models.PersonalSpital;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();

        try {
            PersonalSpital medic = fabricaPersonal.createPersonal(TipPersonal.MEDIC, "Vlad", 6000);
            PersonalSpital asistent = fabricaPersonal.createPersonal(TipPersonal.ASISTENT, "Alex", 5000);
            PersonalSpital brancardier = fabricaPersonal.createPersonal(TipPersonal.BRANCARDIER, "Andrei", 4000);

            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancardier.afisareDetalii();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}