package Models.Fabrica;

import Models.Infirmier;
import Models.PersonalSpital;

public class FabricaInfirmier implements FabricaPersonal {

    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
