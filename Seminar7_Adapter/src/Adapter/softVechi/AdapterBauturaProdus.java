package Adapter.softVechi;

import Adapter.softNou.Bautura;

public class AdapterBauturaProdus extends Produs {
    private Bautura bautura;

    public AdapterBauturaProdus(Bautura bautura) {
        super(bautura.getDenumire(), bautura.getPret());
        this.bautura = bautura;
    }
}
