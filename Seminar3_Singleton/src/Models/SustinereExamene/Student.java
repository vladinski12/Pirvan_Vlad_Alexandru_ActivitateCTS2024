package Models.SustinereExamene;

public class Student {
    private int id;
    private String nume;
    private String email;
    private int an;

    public Student(int id, String nume, String email, int an) {
        this.id = id;
        this.nume = nume;
        this.email = email;
        this.an = an;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", an=" + an +
                '}';
    }
}
