package Main;

import Models.Portar;
import Models.VerificatorPeluza;
import Models.VerificatorTribuna;
import Models.VerificatorVIP;

// E11
public class Main {
    public static void main(String[] args) {
        Portar portar = new Portar();

        portar.setVerificator(new VerificatorVIP());
        portar.verifica("Gigel");

        portar.setVerificator(new VerificatorPeluza());
        portar.verifica("Dorel");

        portar.setVerificator(new VerificatorTribuna());
        portar.verifica("Ionel");
    }
}