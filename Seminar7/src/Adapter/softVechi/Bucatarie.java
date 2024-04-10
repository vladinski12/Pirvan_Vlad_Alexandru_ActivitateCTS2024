package Adapter.softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie {
    private List<Produs> listaProduse;

    public Bucatarie() {
        listaProduse = new ArrayList<>();
    }

    @Override
    public void adaugaProdus(Produs produs) {
        listaProduse.add(produs);
    }

    @Override
    public void printareBon() {
        StringBuilder produseDeAfisat = new StringBuilder("Lista produse: \n");
        float sumaTotala = 0;
        for (Produs produs : listaProduse) {
            produseDeAfisat.append(produs.toString()).append("\n");
            sumaTotala += produs.getPret();
        }
        System.out.println(produseDeAfisat);
        System.out.println("Pret total: " + sumaTotala + "\n");
    }
}
