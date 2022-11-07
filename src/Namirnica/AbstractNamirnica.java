package Namirnica;
//save all package imports
import org.junit.jupiter.api.Assertions;

abstract public class AbstractNamirnica {
	protected String naziv;
	protected int cena;
	protected boolean daLiJeLjuta;
	
	
	public AbstractNamirnica(String naziv,int cena,boolean daLiJeLjuta){

		this.setNaziv(naziv);
		this.setCena(cena);
		this.setDaLiJeLjuta(daLiJeLjuta);
}

	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		if(naziv == null ){
			throw new NullPointerException("naziv ne moze biti null");
		}
		if(naziv.length() == 0 ){
			throw new IllegalArgumentException("naziv ne moze imati 0 karaktera");
		}
		if(naziv.length() >100){
			throw new IllegalArgumentException("naziv mora biti popunjen");

		}

		this.naziv = naziv;
	}



	
	public int getCena() {
		return cena;


	}
	
	public void setCena(int cena) {
		if(cena <0 ){
			throw new IllegalArgumentException("cena ne moze biti manja od 0");}
		else if(cena > 100000){
			throw new IllegalArgumentException("prevazisli ste opseg");
		}

		this.cena = cena;

		}///pozitivna,negativna,granicna
		
	public boolean getDaLiJeLjuta() {
		return daLiJeLjuta;
	}
	
	public void setDaLiJeLjuta(boolean daLiJeLjuta) {
		this.daLiJeLjuta = daLiJeLjuta;
	}

	public String toString() {
		return "Naziv namirnice: " + naziv + ", " + "Cena:" + " " + cena + " " + "Da li je ljuto:" + " " + daLiJeLjuta;

	}

}
