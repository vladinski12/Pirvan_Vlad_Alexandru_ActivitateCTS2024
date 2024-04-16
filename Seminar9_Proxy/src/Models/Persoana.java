package Models;

public class Persoana {
    private String nume;
    private int varsta;
    private String gen;

    public Persoana(String nume, int varsta, String gen) {
        this.nume = nume;
        this.varsta = varsta;
        this.gen = gen;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", gen='" + gen + '\'' +
                '}';
    }
}
