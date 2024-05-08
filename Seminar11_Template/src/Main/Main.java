package Main;

import Models.Pacient;
import Models.SpitalPublic;

//A14
public class Main {
    public static void main(String[] args) {
        SpitalPublic spitalPublic = new SpitalPublic("Spitalul Judetean", 2);
        Pacient pacient1 = new Pacient("Popescu", 5);
        Pacient pacient2 = new Pacient("Ionescu", 3);
        Pacient pacient3 = new Pacient("Georgescu", 2);

        spitalPublic.internare(pacient1);
        spitalPublic.internare(pacient2);
        spitalPublic.internare(pacient3);
    }
}