package Jelo;

import Namirnica.Meso;
import Namirnica.Sir;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Namirnica.*;
public class BurritoTest {

    @Test
    public void cenaBezDodataka() {
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,false);
        Tortilja chili = new Tortilja("cili",79,true);
        TestBurrito b = new TestBurrito(chili,sunka,sitnisir);
        Assertions.assertEquals(389,b.cena());}


    @Test
    public void LjutinaBezDodataka(){
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,true);
        Tortilja chili = new Tortilja("cili",79,false);
        TestBurrito b = new TestBurrito(chili,sunka,sitnisir);
        Assertions.assertEquals(true,b.daLiJeLjuto());}

    @Test
    public void cenaSaSosom() {
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,false);
        Tortilja chili = new Tortilja("cili",79,true);
        TestBurrito b = new TestBurrito(chili,sunka,sitnisir);
        Sos kecap = new Sos("kecap",1,true);
        b.dodajSos(kecap);
        Assertions.assertEquals(390,b.cena());}

    @Test
    public void CenaSaSalatom() {
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,false);
        Tortilja chili = new Tortilja("cili",79,true);
        Salata urnebes = new Salata("urnebes",1,true);

        TestBurrito b = new TestBurrito(chili,sunka,sitnisir);
        b.dodajSalatu(urnebes);
        Assertions.assertEquals(390,b.cena());}


    @Test
    public void LjutinaSaSosom() {
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,false);
        Tortilja chili = new Tortilja("cili",79,false);
        TestBurrito b = new TestBurrito(chili,sunka,sitnisir);
        Sos kecap = new Sos("kecap",1,true);
        b.dodajSos(kecap);
        Assertions.assertEquals(true,b.daLiJeLjuto());}

    @Test
    public void LjutinaSaSalatom() {
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,false);
        Tortilja chili = new Tortilja("cili",79,false);
        Salata urnebes = new Salata("urnebes",1,true);
        TestBurrito b = new TestBurrito(chili,sunka,sitnisir);
        b.dodajSalatu(urnebes);

        Assertions.assertEquals(true,b.daLiJeLjuto());}


    @Test
    public void setSir(){
        Meso sunka = new Meso("sunka",180,false);
        Sir sitnisir = new Sir("sitnisir",130,true);
        Sir kackavalj = new Sir("kackavalj",180,false);
        Tortilja chili = new Tortilja("cili",79,false);
        TestBurrito b = new TestBurrito(chili,sunka,sitnisir);
        b.setSir(kackavalj);
        Assertions.assertEquals(439,b.cena());}


        @Test
        public void SetMeso(){
            Meso sunka = new Meso("sunka",180,false);
            Sir sitnisir = new Sir("sitnisir",130,true);
            Meso kobasica = new Meso("kobasica",170,true);
            Tortilja chili = new Tortilja("cili",79,true);
            TestBurrito b = new TestBurrito(chili,sunka,sitnisir);
            b.setMeso(kobasica);
            Assertions.assertEquals(379,b.cena());}

            @Test
            public void setSirLjutina(){
                Meso sunka = new Meso("sunka",180,false);
                Sir sitnisir = new Sir("sitnisir",130,false);
                Sir kackavalj = new Sir("kackavalj",180,true);
                Tortilja chili = new Tortilja("cili",79,false);
                TestBurrito b = new TestBurrito(chili,sunka,sitnisir);
                b.setSir(kackavalj);
                Assertions.assertEquals(true,b.daLiJeLjuto());}

                @Test
                public void SetMesoLjutina() {
                    Meso sunka = new Meso("sunka", 180, false);
                    Sir sitnisir = new Sir("sitnisir", 130, false);
                    Meso kobasica = new Meso("kobasica", 170, true);
                    Tortilja chili = new Tortilja("cili", 79, false);
                    TestBurrito b = new TestBurrito(chili, sunka, sitnisir);
                    b.setMeso(kobasica);
                    Assertions.assertEquals(true, b.daLiJeLjuto());
                }

                }

                class TestBurrito extends Burrito {

                    public TestBurrito(Tortilja chips,Meso meso,Sir sir) {
                        super(chips,meso,sir);
                    }
                }

