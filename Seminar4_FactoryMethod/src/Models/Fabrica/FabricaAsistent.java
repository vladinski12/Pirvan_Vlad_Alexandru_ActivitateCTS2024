package Models.Fabrica;

import Models.Asistent;
import Models.PersonalSpital;

public class FabricaAsistent implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
