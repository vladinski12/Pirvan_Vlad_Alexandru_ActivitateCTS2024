package Adapter.softNou;

public class Bautura {
    private float pret;
    private String denumire;
    private float gradAlcool = 0;

    public Bautura(float pret, String denumire, float gradAlcool) {
        this.pret = pret;
        this.denumire = denumire;
        this.gradAlcool = gradAlcool;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getGradAlcool() {
        return gradAlcool;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Bautura{" +
                "pret=" + pret +
                ", denumire='" + denumire + '\'' +
                ", gradAlcool=" + gradAlcool +
                '}';
    }
}
