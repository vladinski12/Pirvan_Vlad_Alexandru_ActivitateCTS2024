package Tests;

import Models.IPersoana;
import Models.PachetTuristic;
import Models.Persoana;
import Tests.Categorii.CuMock;
import Tests.Categorii.FaraMock;
import Tests.Dubluri.PersoanaFake;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class PachetTuristicTest {
    @Test
    @Category(FaraMock.class)
    public void testCorectitudineAplicaDiscount() {
        IPersoana client = new Persoana("Popescu", "1301212");
        PachetTuristic pachet = new PachetTuristic(client, "Mamaia", 1000.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(900.0, pachet.getPret(), 0.01);
    }

    @Test
    @Category(FaraMock.class)
    public void testRangeBoundaryAplicaDiscount() {
        IPersoana client = new Persoana("Popescu", "1590204");
        PachetTuristic pachet = new PachetTuristic(client, "Mamaia", 1000.0);
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(800.0, pachet.getPret(), 0.01);
    }

    @Test
    @Category(CuMock.class)
    public void aplicaDiscountFake() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setValoareGetVarsta(65);
        PachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 1000.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(900.0, pachet.getPret(), 0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareNuAplicaDiscountFake() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setValoareGetVarsta(25);
        PachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 1000.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(1000.0, pachet.getPret(), 0.01);
    }

    @Test()
    @Category(CuMock.class)
    public void valoareAplicaDiscount100() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setValoareGetVarsta(100);
        PachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 1000.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(900.0, pachet.getPret(), 0.01);
    }

    @Test()
    @Category(CuMock.class)
    public void valoareAplicaDiscount0() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setValoareGetVarsta(100);
        PachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 1000.0);
        pachet.aplicaDiscountVarstnici(0);
        assertEquals(1000.0, pachet.getPret(), 0.01);
    }

    @Test()
    @Category(CuMock.class)
    public void valoareAplicaDiscount1() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setValoareGetVarsta(100);
        PachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 1000.0);
        pachet.aplicaDiscountVarstnici(1);
        assertEquals(990, pachet.getPret(), 0.01);
    }
}