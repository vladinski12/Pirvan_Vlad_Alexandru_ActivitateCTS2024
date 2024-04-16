package Models;

public class ProxyVarsta implements Vanzare {
    private static int varstaMinima;
    private Vanzare vanzareBilet;

    public ProxyVarsta(Vanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    public static void setVarstaMinima(int varstaMinima) {
        ProxyVarsta.varstaMinima = varstaMinima;
    }

    @Override
    public void vinde(Persoana persoana) {
        if (persoana.getVarsta() >= varstaMinima) {
            this.vanzareBilet.vinde(persoana);
        } else {
            System.out.println(persoana + " nu poate achizitiona bilet deoarece are varsta " + persoana.getVarsta());
        }
    }
}
