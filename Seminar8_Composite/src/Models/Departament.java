package Models;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbstracta {
    private List<StructuraAbstracta> structuri;
    private String directorDepartament;

    public Departament(String nume, String directorDepartament) {
        super(nume);
        this.directorDepartament = directorDepartament;
        this.structuri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        structuri.add(sa);
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        structuri.remove(sa);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        if (index >= 0 && index < structuri.size()) {
            return structuri.get(index);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaDescriere(String indentare) {
        System.out.println(indentare + " Departamentul " + super.getNume() + " este condus de " + this.directorDepartament + " si are urmatoarea componenta: ");
        for (StructuraAbstracta sa : this.structuri) {
            sa.afiseazaDescriere(indentare + "       ");
        }
    }
}
