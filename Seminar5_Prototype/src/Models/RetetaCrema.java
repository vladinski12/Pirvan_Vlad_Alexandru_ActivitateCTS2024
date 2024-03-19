package Models;

public class RetetaCrema implements RetetaAbstracta {
    private int cantitate;
    private String nume;

    public RetetaCrema() {
        this.cantitate = 0;
        this.nume = "";
    }

    public RetetaCrema(int cantitate, String nume) {
        this.cantitate = cantitate;
        this.nume = nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public RetetaAbstracta clone() {
        RetetaCrema reteta = new RetetaCrema();
        reteta.setNume(this.nume);
        reteta.setCantitate(this.cantitate);
        return reteta;
    }

    @Override
    public String toString() {
        return "RetetaCrema{" +
                "cantitate=" + cantitate +
                ", nume='" + nume + '\'' +
                '}';
    }
}
