package Main;

import Models.Observer.Abonat;
import Models.Observer.Observer;
import Models.Observer.Vecin;
import Models.Subject.Sala;
import Models.Subject.Stadion;
import Models.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

// E12
public class Main {
    public static void main(String[] args) {
        Observer abonat1 = new Abonat("Ion");
        Observer abonat2 = new Abonat("Gheorghe");
        Observer abonat3 = new Abonat("Vasile");

        Observer vecin1 = new Vecin("Maria", 120);
        Observer vecin2 = new Vecin("Ana", 100);


        Subject sala = new Sala();
        sala.adaugaAbonat(abonat1);
        sala.adaugaAbonat(abonat2);
        sala.adaugaAbonat(abonat3);

        sala.adaugaAbonat(vecin1);
        sala.adaugaAbonat(vecin2);

        sala.notificaMeciFotbal();
        sala.stergeAbonat(abonat2);
        sala.notificaMeciHandbal();
        
        Subject stadion = new Stadion();
        stadion.adaugaAbonat(abonat1);
        stadion.adaugaAbonat(abonat1);

        ((Stadion) stadion).notificaConcert();
    }
}