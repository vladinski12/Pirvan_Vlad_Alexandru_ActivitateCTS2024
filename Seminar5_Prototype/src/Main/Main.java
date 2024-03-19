package Main;

import Models.Reteta;
import Models.RetetaAbstracta;
import Models.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii = new HashMap<>();
        solutii.put("sol1", 100.0);
        solutii.put("sol2", 50.0);
        solutii.put("sol3", 200.0);
        Reteta retetaPrototip = new Reteta(solutii, "Reteta1");

        RetetaAbstracta reteta2 = retetaPrototip.clone();

        System.out.println(retetaPrototip);
        System.out.println(reteta2);

        RetetaCrema retetaCremaPrototip = new RetetaCrema(100, "RetetaCrema1");
        RetetaAbstracta retetaCrema2 = retetaCremaPrototip.clone();

        System.out.println(retetaCremaPrototip);
        System.out.println(retetaCrema2);
    }
}