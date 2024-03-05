package Models.readers.classes;

import Models.Angajat;
import Models.Aplicant;
import Models.readers.interfaces.ApplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends ApplicantReader {

    public AngajatReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(super.fileName));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Angajat angajat = new Angajat();
            super.readAplicant(scanner, angajat);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }
}
