package Main;

import Models.DatabaseConnection;
import Models.SustinereExamene.Student;
import Models.SustinereExamene.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance("postgres", 3, "postgres://localhost:5432");
        DatabaseConnection db2 = DatabaseConnection.getInstance("mysql", 4, "mysql://localhost:5432");

        db2.setLinkConexiune("mssql");

        System.out.println(db1.toString());
        System.out.println(db2.toString());

        Student student1 = new Student(1, "Vlad", "vlad@gmail.com", 3);
        Student student2 = new Student(2, "Alex", "alex@gmail.com", 3);

        SustinereExamen examenCTS = new SustinereExamen();
        examenCTS.setNume("CTS");

        SustinereExamen examenPOO = new SustinereExamen();
        examenPOO.setNume("POO");

        examenCTS.inregistrareStudent(student1);
        examenCTS.inregistrareStudent(student1);
        examenCTS.inregistrareStudent(student2);

        examenPOO.inregistrareStudent(student1);
        examenPOO.inregistrareStudent(student1);
    }
}