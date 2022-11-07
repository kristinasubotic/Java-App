package Jelo;

import Namirnica.Meso;
import Namirnica.Sir;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Namirnica.*;
import static org.junit.jupiter.api.Assertions.*;

public class TortiljaChipsTest {

    @Test
    public void cenaBezDodataka() {
        Tortilja chips = new Tortilja("chips",99,false);
        Sos pavlaka = new Sos("pavlaka",0,false);
        TestTortiljaChips t = new TestTortiljaChips(chips,pavlaka);
        Assertions.assertEquals(99,t.cena());}

    @Test

    public void LjutinaBezDodataka() {
        Tortilja chips = new Tortilja("chips",99,false);
        Sos pavlaka = new Sos("pavlaka",0,false);
        TestTortiljaChips t = new TestTortiljaChips(chips,pavlaka);
        Assertions.assertEquals(false,t.daLiJeLjuto());}


    @Test
    public void cenaBlagaTortiljaiBlagiSos() {
        Tortilja blagaTortilja = new Tortilja("chips",99,false);
        Sos blagiSos = new Sos("pavlaka",0,false);
        TestTortiljaChips t = new TestTortiljaChips(blagaTortilja,blagiSos);
        Assertions.assertEquals(false,t.daLiJeLjuto());}


    @Test
    public void cenaLjutaTortiljaiLjutiSos() {
        Tortilja ljutaTortilja = new Tortilja("chips",99,true);
        Sos ljutiSos = new Sos("pavlaka",0,true);
        TestTortiljaChips t = new TestTortiljaChips(ljutaTortilja,ljutiSos);
        Assertions.assertEquals(true,t.daLiJeLjuto());}


 @Test
    public void cenaLjutaTortiljaiBlagiSos() {
        Tortilja ljutaTortilja = new Tortilja("chips",99,true);
        Sos blagiSos = new Sos("pavlaka",0,false);
        TestTortiljaChips t = new TestTortiljaChips(ljutaTortilja,blagiSos);
        Assertions.assertEquals(true,t.daLiJeLjuto());}

 @Test
    public void cenaBlagaTortiljaLjutiSos() {
        Tortilja blagaTortilja = new Tortilja("chips",99,false);
        Sos LjutiSos = new Sos("pavlaka",0,true);
        TestTortiljaChips t = new TestTortiljaChips(blagaTortilja,LjutiSos);
        Assertions.assertEquals(true,t.daLiJeLjuto());}



@Test
    public void cenaSetSos() {
        Tortilja blagaTortilja = new Tortilja("chips",99,false);
        Sos pavlaka = new Sos("pavlaka",0,true);
        Sos kecap = new Sos("kecap",1,true);
        TestTortiljaChips t = new TestTortiljaChips(blagaTortilja,pavlaka);
        t.setSos(kecap);
            Assertions.assertEquals(100,t.cena());}



@Test
    public void cenaSetChips() {
        Tortilja blagaTortilja = new Tortilja("chips",99,false);
        Sos pavlaka = new Sos("pavlaka",0,false);
        Sos kecap = new Sos("kecap",1,false);
        Tortilja chili = new Tortilja("chili",99,true);
        TestTortiljaChips t = new TestTortiljaChips(blagaTortilja,pavlaka);
        t.setChips(chili);
            Assertions.assertEquals(99,t.cena());}




@Test
    public void LjutinaSetChips() {
        Tortilja blagaTortilja = new Tortilja("chips",99,false);
        Sos pavlaka = new Sos("pavlaka",0,false);
        Sos kecap = new Sos("kecap",1,false);
Tortilja chili = new Tortilja("chili",1,true);
        TestTortiljaChips t = new TestTortiljaChips(blagaTortilja,pavlaka);
        t.setChips(chili);
            Assertions.assertEquals(true,t.daLiJeLjuto());}



@Test
    public void LjutinaSetSos() {
        Tortilja blagaTortilja = new Tortilja("chips",99,false);
        Sos pavlaka = new Sos("pavlaka",0,false);
        Sos kecap = new Sos("kecap",1,true);
        TestTortiljaChips t = new TestTortiljaChips(blagaTortilja,pavlaka);
        t.setSos(kecap);
            Assertions.assertEquals(true,t.daLiJeLjuto());}

}

class TestTortiljaChips extends TortiljaChips {

    public TestTortiljaChips(Tortilja chips,Sos sos) {
        super(chips,sos);
    }
}

