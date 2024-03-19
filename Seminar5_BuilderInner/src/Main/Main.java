package Main;

import Models.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient.PacientBuilder().setPatRabatabil(true).setMicDejunInclus(true).setPapuciDeCamera(true).setHalatPentruInterior(true).build();
        System.out.println(pacient);
    }
}