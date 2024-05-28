package Tests.Dubluri;

import Models.IPersoana;

public class PersoanaFake implements IPersoana {
    private String valoareGetSex;
    private int valoareGetVarsta;
    private boolean valoareGetCheckCNP;

    public void setValoareGetCheckCNP(boolean valoareGetCheckCNP) {
        this.valoareGetCheckCNP = valoareGetCheckCNP;
    }

    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    @Override
    public String getSex() {
        return valoareGetSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoareGetCheckCNP;
    }
}
