package Namirnica;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;


public class AbstractNamirnicaTest {


    @Test
    public void testKonstruktorCenaPozitivna() {
        TestNamirnica c = new TestNamirnica("namirnica", 90, true);
        Assertions.assertEquals(90, c.getCena());
    }

    @Test
    public void testKonstruktorCena0() {
        TestNamirnica c = new TestNamirnica("namirnica", 0, true);
        Assertions.assertEquals(0, c.getCena());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKonstruktorCenaNegativna() {
        TestNamirnica c = new TestNamirnica("namirnica", -1, true);
        Assertions.assertEquals(-1, c.getCena());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKonstruktorCenaIzvanopsega() {
        TestNamirnica c = new TestNamirnica("namirnica", 10000000, true);
        Assertions.assertEquals(100000000, c.getCena());
    }




    @Test
    public void testSetCenaPozitivna() {
        TestNamirnica c = new TestNamirnica("namirnica", 0, true);
        c.setCena(42);
        Assertions.assertEquals(42, c.getCena());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCenaIzvanOpsega() {
        TestNamirnica c = new TestNamirnica("namirnica", 90, true);
        c.setCena(1000000);
        Assertions.assertEquals(1000000, c.getCena());
    }

    @Test
    public void testSetCena0() {
        TestNamirnica c = new TestNamirnica("namirnica", 90, true);
        c.setCena(0);
        Assertions.assertEquals(0, c.getCena());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCenanegativna() {
        TestNamirnica c = new TestNamirnica("namirnica", 90, true);
        c.setCena(-10);
        Assertions.assertEquals(-10, c.getCena());
    }


}


class TestNamirnica extends AbstractNamirnica {

    public TestNamirnica(String naziv, int cena, boolean daLiJeLjuta) {
        super(naziv, cena, daLiJeLjuta);
    }
}