package ro.ase.cts.clase;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.xpath.XPathEvaluationResult;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @org.junit.jupiter.api.Test
    public void testGetSexPanaIn2000() throws Exception {
        IPersoana persoana = new Persoana("Matei", "123412341235");
        Assert.assertEquals("M", persoana.getSex());

    }

    @Test
    public void testGenPersoanaBoundaryInferior2000() {
        IPersoana persoana = new Persoana("Mircea", "502301230412034");
        Assert.assertEquals("M", persoana.getSex());
    }

    @Test
    public void testPersoanaNascutaAzi() {
        IPersoana persoana = new Persoana("Mihai", "5260514143793");
        Assert.assertEquals(0, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    public void testGetSexDupa2000() throws Exception {
        IPersoana persoana = new Persoana("Ana", "6161616163");
        Assert.assertEquals("F", persoana.getSex());

    }

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() throws Exception {

    }

    @Test
    void testCheckCNP() {
        IPersoana persoana2 = new Persoana("Matei", "1890725702598");
        Assert.assertEquals(true, persoana2.checkCNP());
        Assert.assertTrue(persoana2.checkCNP());
    }

    @Test
    void getVarsta() {
        IPersoana persoana2 = new Persoana("Matei", "504045631197");
    }

    @Test
    public void testGetGenCrossCheck() {
        String cnp = "234523452455";
        String expected;
        IPersoana persoana = new Persoana("Andreea", cnp);
        if (cnp.charAt(0) % 2 == 0) {
            expected = "F";
        } else {
            expected = "M";
        }

        String actual = persoana.getSex();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCheckLungimeCnp(){
        IPersoana persoana=new Persoana("Andreea","13496028346290342234");
        assertThrows(IllegalArgumentException.class, () -> {
            persoana.checkCNP();
        });
    }
}