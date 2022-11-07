package Jelo;

import Namirnica.Meso;
import Namirnica.Sir;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Namirnica.*;

import static org.junit.jupiter.api.Assertions.*;

class ObrokSalataTest {

    @Test
    public void cenaBezDodataka() {
        Meso kobasica = new Meso("Kobasica",100,false);
        Sir kackavalj = new Sir("kackavalj",120,false);
        TestObrokSalata o = new TestObrokSalata(kobasica,kackavalj);
        Assertions.assertEquals(220,o.cena());
}

    @Test
 
    public void daLiJeLjuto() {
        Meso kobasica = new Meso("Kobasica",100,false);
        Sir kackavalj = new Sir("kackavalj",120,false);
        TestObrokSalata o = new TestObrokSalata(kobasica,kackavalj);
        Assertions.assertEquals(false,o.daLiJeLjuto());}

@Test
    public void CenaSaSosom() {
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,false);
        Sos kecap = new Sos("kecap",1,true);
         TestObrokSalata b = new TestObrokSalata(sunka,sitnisir);
        b.dodajSos(kecap);

      
        Assertions.assertEquals(311,b.cena());}



@Test
    public void CenaSaSalatom() {
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,false);
        Salata urnebes = new Salata("urnebes",1,true);
        TestObrokSalata b = new TestObrokSalata(sunka,sitnisir);
        b.dodajSalatu(urnebes);
        
        Assertions.assertEquals(311,b.cena());}


@Test
    public void LjutinaSaSosom() {
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,false);
        Sos kecap = new Sos("kecap",1,true);
         TestObrokSalata b = new TestObrokSalata(sunka,sitnisir);
        b.dodajSos(kecap);

      
        Assertions.assertEquals(true,b.daLiJeLjuto());}



@Test
    public void LjutinaSaSalatom() {
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,false);
        Salata urnebes = new Salata("urnebes",1,true);
        Tortilja chili = new Tortilja("chili",150,true);
        TestObrokSalata b = new TestObrokSalata(sunka,sitnisir);
        b.dodajSalatu(urnebes);
        
        Assertions.assertEquals(true,b.daLiJeLjuto());}


@Test
    public void CenaiSaSosomiSaSalatom() {
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,false);
        Sos kecap = new Sos("kecap",1,true);
        Salata kupus = new Salata("kupus",1,false);
    TestObrokSalata b = new TestObrokSalata(sunka,sitnisir);
        b.dodajSos(kecap);
       b.dodajSalatu(kupus);

      
        Assertions.assertEquals(312,b.cena());}

@Test
    public void LjutinaSaSaSosomiSalatom() {
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,false);
        Salata urnebes = new Salata("urnebes",1,true);
        Sos kecap = new Sos("kecap",1,false);
        TestObrokSalata b = new TestObrokSalata(sunka,sitnisir);
        b.dodajSalatu(urnebes);
        b.dodajSos(kecap);
        
        Assertions.assertEquals(true,b.daLiJeLjuto());}




}

class TestObrokSalata extends ObrokSalata {

    public TestObrokSalata(Meso meso,Sir sir) {
        super(meso,sir);
    }
}

