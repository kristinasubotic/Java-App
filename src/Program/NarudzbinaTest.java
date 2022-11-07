package Program;

import Jelo.*;
import Namirnica.*;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class NarudzbinaTest {

    @Test 
    public void cenaSaSosom(){

        Meso kobasica = new Meso("Kobasica",100,true);
        Sir kackavalj = new Sir("kackavalj",120,false);
        Sos kecap = new Sos("kecap",1,true);
  
        ObrokSalata o = new ObrokSalata(kobasica,kackavalj);
        o.dodajSos(kecap);
    
        Narudzbina n = new Narudzbina();


        n.dodajStavku(o);
        Assertions.assertEquals(221,n.cena());}
        



    @Test 
    public void cenaSaSalatom(){

        Meso kobasica = new Meso("Kobasica",100,true);
        Sir kackavalj = new Sir("kackavalj",120,false);
 
       Salata zelena = new Salata("zelena",1,true);
        ObrokSalata o = new ObrokSalata(kobasica,kackavalj);
        
       o.dodajSalatu(zelena);
        Narudzbina n = new Narudzbina();
   

        n.dodajStavku(o);
        Assertions.assertEquals(221,n.cena());}
       

@Test 
    public void cenaSaSosomiSaSalatom(){

        Meso kobasica = new Meso("Kobasica",100,true);
        Sir kackavalj = new Sir("kackavalj",120,false);
        Sos kecap = new Sos("kecap",1,true);
        Salata zelena = new Salata("zelena",1,true);

  
        ObrokSalata o = new ObrokSalata(kobasica,kackavalj);
        o.dodajSos(kecap);
       o.dodajSalatu(zelena);
    
        Narudzbina n = new Narudzbina();


        n.dodajStavku(o);
        Assertions.assertEquals(222,n.cena());}
        
    }


