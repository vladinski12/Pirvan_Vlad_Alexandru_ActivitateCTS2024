package Models;

public class VanzareBilet implements Vanzare {
    private String numeMeci;
    private int pretBilet;

    public VanzareBilet(String numeMeci, int pretBilet) {
        this.numeMeci = numeMeci;
        this.pretBilet = pretBilet;
    }

    @Override
    public void vinde(Persoana persoana) {
        System.out.println(persoana + " a cumparat bilet la meciul " + this.numeMeci);
    }
}
