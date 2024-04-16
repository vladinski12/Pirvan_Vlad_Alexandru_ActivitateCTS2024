package Main;

import Models.*;

// E8
public class Main {
    public static void main(String[] args) {
        Vanzare vanzareBilet = new VanzareBilet("meci@1", 60);
        Persoana persoana1 = new Persoana("Andreea", 12, "F");
        Persoana persoana2 = new Persoana("Vlad", 21, "M");
        vanzareBilet.vinde(persoana1);
        vanzareBilet.vinde(persoana2);

        ProxyVarsta proxyVarsta = new ProxyVarsta(vanzareBilet);
        proxyVarsta.vinde(persoana1);
        proxyVarsta.vinde(persoana2);

        ProxyGen proxyGen = new ProxyGen(vanzareBilet, "M");
        proxyGen.vinde(persoana1);
        proxyGen.vinde(persoana2);
    }
}