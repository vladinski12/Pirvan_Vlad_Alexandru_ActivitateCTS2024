package Models.Fabrica;

import Models.Medic;
import Models.PersonalSpital;

public class FabricaMedic implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
