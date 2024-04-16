package Models;

import java.util.Objects;

public class ProxyGen implements Vanzare {
    private Vanzare vanzareBilet;
    private String genAcceptat;

    public ProxyGen(Vanzare vanzareBilet, String genAcceptat) {
        this.vanzareBilet = vanzareBilet;
        this.genAcceptat = genAcceptat;
    }


    @Override
    public void vinde(Persoana persoana) {
        if (Objects.equals(persoana.getGen(), genAcceptat)) {
            this.vanzareBilet.vinde(persoana);
        } else {
            System.out.println(persoana + " nu poate achizitiona bilet deoarece are genul " + persoana.getGen());
        }
    }
}
