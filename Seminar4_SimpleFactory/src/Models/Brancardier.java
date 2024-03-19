package Models;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Brancardierul " + this.getNume() + " este la spital.");

    }
}
