package Adapter.Main;

import Adapter.softNou.Bar;
import Adapter.softNou.Bautura;
import Adapter.softVechi.*;

public class Main {
    public static void platesteConsumatia(SoftBucatarie bucatarie) {
        bucatarie.printareBon();
    }

    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        bucatarie.adaugaProdus(new Produs("Pizza", 30));
        bucatarie.adaugaProdus(new Produs("Ciorba", 29));

        platesteConsumatia(bucatarie);

        AdapterComandaBarBucatarie bar = new AdapterComandaBarBucatarie();
        bar.adaugaBautura(new Bautura(20, "Mojito", 35));
        bar.adaugaBautura(new Bautura(25, "Cola", 0));
        bar.adaugaProdus(new AdapterBauturaProdus(new Bautura(23, "Apa", 10)));

        platesteConsumatia(bar);
    }
}