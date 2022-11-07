package Namirnica;

public class Salata extends AbstractNamirnica {
	public Salata(String naziv,int cena,boolean daLiJeLjuta){
		super(naziv,cena,daLiJeLjuta);
	}
	

	public String toString() {
		return "Naziv namirnice: " + naziv + ", "+"Cena:" + " " + cena +" " +  "Da li je ljuto:" + " "+ daLiJeLjuta;
	}
}
