package Models.SustinereExamene;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
    private String nume;
    private Map<Integer, Student> listaStudenti = new HashMap<>();

    public String getNume() {
        return nume;
    }

    public Map<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void inregistrareStudent(Student student) {
        if (listaStudenti.containsKey(student.getId())) {
            System.out.println(student.toString() + " nu are voie sa sustina acest examen!");
            return;
        }
        listaStudenti.put(student.getId(), student);
        System.out.println(student.toString() + " sustine acum acest examen!");
    }
}
