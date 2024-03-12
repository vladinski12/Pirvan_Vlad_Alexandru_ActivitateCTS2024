package Models;

public abstract class PersonalSpital {
    private String nume;
    private int salariu;

    public PersonalSpital(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public abstract void afisareDetalii();

    @Override
    public String toString() {
        return "PersonalSpital{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
