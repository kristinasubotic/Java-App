package Namirnica;

public class Meso extends AbstractNamirnica {
	public Meso(String naziv,int cena,boolean daLiJeLjuta){
		super(naziv,cena,daLiJeLjuta);
	}
	
	
	public String toString() {
		return "Naziv namirnice: " + naziv + ", "+"Cena:" + " " + cena +" " +  "Da li je ljuto:" + " "+ daLiJeLjuta;
	}
}
