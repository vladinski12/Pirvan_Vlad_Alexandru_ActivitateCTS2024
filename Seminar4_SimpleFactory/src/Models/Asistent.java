package Models;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Asistentul " + this.getNume() + " este la spital.");
    }
}
