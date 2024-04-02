package Adapter.softNou;

import Adapter.softVechi.Produs;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private List<Bautura> listaBauturi;

    public Bar() {
        listaBauturi = new ArrayList<>();
    }

    public void adaugaBautura(Bautura bautura) {
        listaBauturi.add(bautura);
    }

    public void afiseareNotaDePlata() {
        StringBuilder bauturiDeAfisat = new StringBuilder("Lista bauturi: \n");
        float sumaTotala = 0;
        for (Bautura bautura : listaBauturi) {
            bauturiDeAfisat.append(bautura.toString()).append("\n");
            sumaTotala += bautura.getPret();
        }
        System.out.println(bauturiDeAfisat);
        System.out.println("Pret total: " + sumaTotala + "\n");
    }

}
