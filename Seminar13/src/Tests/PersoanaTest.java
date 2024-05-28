package Tests;

import Models.Persoana;
import Tests.Categorii.FaraMock;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    @Category(FaraMock.class)
    public void getSexReturnF() {
        Persoana pers1 = new Persoana("Simona", "6021118520090");
        assertEquals(pers1.getSex(), "F");
    }

    @org.junit.Test
    @Category(FaraMock.class)
    public void getSexReturnM() {
        Persoana pers2 = new Persoana("Andrei", "5021118520090");
        assertEquals(pers2.getSex(), "M");
    }

    @org.junit.Test
    @Category(FaraMock.class)
    public void getSexReturnLimitaInferioara() {
        Persoana pers2 = new Persoana("Andrei", "1021118520090");
        assertEquals(pers2.getSex(), "M");
    }

    @org.junit.Test
    @Category(FaraMock.class)
    public void getSexCrossCheck() {
        String cnp = "1021118520090";
        Persoana pers2 = new Persoana("Andrei", cnp);
        String sex;
        if (Integer.valueOf(cnp.charAt(0)) % 2 == 0) {
            sex = String.valueOf('F');
        } else {
            sex = String.valueOf('M');
        }
        assertEquals(pers2.getSex(), sex);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(FaraMock.class)
    public void getSexErrorCNPStartWithNumberOutsideCases() {
        Persoana persoana = new Persoana("Andrei", "9021118520090");
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(FaraMock.class)
    public void getSexErrorCNPStartWithInvalidCharacter() {
        Persoana persoana = new Persoana("Andrei", "-021118520090");
        persoana.getSex();
    }

    @org.junit.Test(expected = NullPointerException.class)
    @Category(FaraMock.class)
    public void getSexErrorCNPIsEmptyString() {
        Persoana persoana = new Persoana("Andrei", "");
        persoana.getSex();
    }

    @org.junit.Test(timeout = 200)
    @Category(FaraMock.class)
    public void getSexPerformance() {
        Persoana persoana = new Persoana("Andrei", "1293821039");
        persoana.getSex();
    }

    @org.junit.Test
    @Category(FaraMock.class)
    public void getSexCorrect() {
        Persoana persoana = new Persoana("Andrei", "1293821039");
        assertEquals(1, persoana.getSex().length());
    }

    @org.junit.Test
    @Category(FaraMock.class)
    public void getSexCorrectByLetter() {
        Persoana persoana = new Persoana("Andrei", "3293821039");
        boolean isCorrect = persoana.getSex().toLowerCase().equals("m") || persoana.getSex().toLowerCase().equals("f");
        assertTrue(isCorrect);
    }

    @org.junit.Test
    @Category(FaraMock.class)
    public void getSexOrder() {
        Persoana persoana = new Persoana("Andrei", "1021118520090");
        Persoana pers1 = new Persoana("Simona", "6021118520090");
        assertTrue(persoana.getSex().compareTo(pers1.getSex()) > 0);
    }

    @org.junit.Test
    @Category(FaraMock.class)
    public void getSexRange() {
        Persoana pers1 = new Persoana("Simona", "8021118520090");
        assertEquals(true, pers1.getSex().equals("F"));
    }

    @org.junit.Test(expected = NullPointerException.class)
    @Category(FaraMock.class)
    public void getSexExistance() {
        Persoana pers1 = new Persoana("Simona", null);
        pers1.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(FaraMock.class)
    public void getSexCardinality() {
        Persoana pers1 = new Persoana("Simona", "0000000000000");
        pers1.getSex();
    }
}