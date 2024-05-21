package Models;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getSexReturnF() {
        Persoana persoana = new Persoana("Popescu Ion", "5900101010101");
        assertEquals("M", persoana.getSex());
    }

    @org.junit.Test
    public void getSexReturnM() {
        Persoana persoana = new Persoana("Popescu Ion", "6900101010101");
        assertEquals("F", persoana.getSex());
    }

    @org.junit.Test
    public void getSexReturnInterval() {
        Persoana persoana = new Persoana("Popescu Ion", "6900101010101");
        assertEquals("F", persoana.getSex());
    }

    @org.junit.Test
    public void getSexCrossCheck() {
        String cnp = "104325234523";
        Persoana persoana = new Persoana("Andrei", cnp);
        String sex;
        if (Integer.valueOf(cnp.charAt(0)) % 2 == 0) {
            sex = String.valueOf("F");
        } else {
            sex = String.valueOf("M");
        }
        assertEquals(persoana.getSex(), sex);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition() {
        Persoana persoana = new Persoana("Andrei", "904325345243");
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexWrongStringErrorCondition() {
        Persoana persoana = new Persoana("Andrei", "fasdfasc");
        persoana.getSex();
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexEmptyStringErrorCondition() {
        Persoana persoana = new Persoana("Andrei", "");
        persoana.getSex();
    }

    @org.junit.Test(timeout = 200)
    public void getSexPerformance() {
        Persoana persoana = new Persoana("Andrei", "123123");
        persoana.getSex();
    }

    @org.junit.Test()
    public void getSexCorrect() {
        Persoana persoana = new Persoana("Andrei", "12312312");
        assertEquals(1, persoana.getSex().length());
    }

    @org.junit.Test()
    public void getSexCorrectByLetter() {
        Persoana persoana = new Persoana("Andrei", "123123123");
        boolean isCorrect = persoana.getSex().equalsIgnoreCase("m") || persoana.getSex().equalsIgnoreCase("f");
        assertTrue(isCorrect);
    }

    @org.junit.Test()
    public void getSexOrder() {
        Persoana persoana = new Persoana("Andrei", "12312312123123");
        Persoana persoana2 = new Persoana("Simona", "602123121221312");
        assertTrue(persoana.getSex().compareTo(persoana2.getSex()) > 0);
    }


    @org.junit.Test()
    public void getSexRange() {
        Persoana persoana = new Persoana("Andrei", "8233123");
        assertEquals("F", persoana.getSex());
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistance() {
        Persoana persoana = new Persoana("Andrei", null);
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexCardinality() {
        Persoana persoana = new Persoana("Andrei", "0");
        persoana.getSex();
    }


    @org.junit.Test
    public void getVarsta() {
    }

    @org.junit.Test
    public void checkCNP() {
    }
}