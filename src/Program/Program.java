package Program;
import Namirnica.Meso;

import java.util.ArrayList;
import Jelo.ObrokSalata;
import Jelo.*;
import Namirnica.*;


public class Program {
	public static void main(String[] args) {
		/*
		Meso kobasica = new Meso("Kobasica",100,true);
		Meso sunka = new Meso("sunka",180,false);
		
		Sir kackavalj = new Sir("kackavalj",120,false);
		Sir sitnisir = new Sir("sitnisir",130,false);
		
		Sos kecap = new Sos("kecap",0,false);
		Sos paradajz = new Sos("paradajz",30,true);

		Salata zelena = new Salata("zelena",18,true);
		Salata kupus = new Salata("kupus",22,false);


		Tortilja chill = new Tortilja("cili",79,true);

		Burrito b = new Burrito(chill,sunka,kackavalj);
		TortiljaChips a = new TortiljaChips(chill, kecap);

	    ObrokSalata salata1 = new ObrokSalata(kobasica,kackavalj);
		ObrokSalata salata2 = new ObrokSalata(sunka,sitnisir);
		
		salata1.dodajSos(kecap);
		
		//salata1.dodajSalatu(zelena);
		
		salata2.dodajSos(paradajz);
		salata2.dodajSalatu(kupus);

		System.out.println(salata1);
		System.out.println(salata2);
		System.out.println("ukupna cena je: " + salata1.cena());
		System.out.println("ukupna cena je: " + salata2.cena());
		System.out.println("Da li je bar jedan od sastojaka  ljut:"+ " " + salata1.daLiJeLjuto());

		Narudzbina n1 = new Narudzbina();
		n1.dodajStavku(salata1);
		n1.dodajStavku(salata2);
		System.out.println(n1);
		System.out.println("ukupna cena:  "+n1.cena());
		System.out.println("Da li je bar jedan od sastojaka  ljut za salatu1:"+ " " + salata1.daLiJeLjuto());
		System.out.println("Da li je bar jedan od sastojaka ljut za salatu2:"+ ""+salata2.daLiJeLjuto());

		//
		//zelena.setCena(0);
*/
		Meso daLiMozeOvo = new Meso("naziv", -666, true);
		System.out.println(daLiMozeOvo);


	}


}