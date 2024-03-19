package Models;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Infirmier: " + this.getNume() + " - " + this.getSalariu());
    }
}
