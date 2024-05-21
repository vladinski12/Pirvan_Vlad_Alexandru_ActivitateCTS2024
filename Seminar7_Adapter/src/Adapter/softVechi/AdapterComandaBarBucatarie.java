package Adapter.softVechi;

import Adapter.softNou.Bar;
import Adapter.softNou.Bautura;

public class AdapterComandaBarBucatarie extends Bar implements SoftBucatarie {
    @Override
    public void printareBon() {
        super.afiseareNotaDePlata();
    }

    @Override
    public void adaugaProdus(Produs produs) {
        Bautura bautura = new Bautura(produs.getPret(), produs.getDenumire(), 0);
        super.adaugaBautura(bautura);
    }
}
