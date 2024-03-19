package Models;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta {
    private Map<String, Double> solutii;
    private String numeReteta;

    public Reteta() {
        this.solutii = null;
        this.numeReteta = "";
    }

    public Reteta(Map<String, Double> solutii, String numeReteta) {
        this.solutii = solutii;
        this.numeReteta = numeReteta;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        if (this.solutii == null) {
            this.solutii = new HashMap<>();
        }
        for (String solutie : solutii.keySet()) {
            this.solutii.put(solutie, solutii.get(solutie));
        }
    }

    public String getNumeReteta() {
        return numeReteta;
    }

    public void setNumeReteta(String numeReteta) {
        this.numeReteta = numeReteta;
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta reteta = new Reteta();
        reteta.setNumeReteta(this.numeReteta);
        reteta.setSolutii(this.solutii);
        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", numeReteta='" + numeReteta + '\'' +
                '}';
    }
}
