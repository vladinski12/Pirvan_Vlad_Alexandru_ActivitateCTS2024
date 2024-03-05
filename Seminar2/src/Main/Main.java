package Main;

import Models.Aplicant;
import Models.readers.classes.AngajatReader;
import Models.readers.interfaces.ApplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        ApplicantReader angajatReader = new AngajatReader("./Seminar2/fisiere/angajati.txt");

        try {
            listaAngajati = angajatReader.read();
            for (Aplicant angajat : listaAngajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}