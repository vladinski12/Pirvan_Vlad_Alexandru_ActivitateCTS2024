package Main;

import Models.Pacient;
import Models.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new PacientBuilder().setPatRabatabil(true).setMicDejunInclus(true).setPapuciDeCamera(true).setHalatPentruInterior(true).build();
        System.out.println(pacient);

        Pacient pacient2 = new PacientBuilder().setPatRabatabil(true).setMicDejunInclus(true).build();
        System.out.println(pacient2);
    }
}