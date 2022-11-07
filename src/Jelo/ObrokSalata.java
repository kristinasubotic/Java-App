package Jelo;

import Namirnica.Meso;
import Namirnica.Sir;
import java.util.ArrayList;
import Namirnica.Sos;
import Namirnica.Salata;

public class ObrokSalata extends AbstractJelo{
	Meso meso;
	Sir sir;

	ArrayList<Sos> sosevi = new ArrayList<Sos>();
	ArrayList<Salata> salate = new ArrayList<Salata>();


	 
	public ObrokSalata(Meso meso,Sir sir){
		this.setMeso(meso);
		this.setSir(sir);
		
		}



    public void setMeso(Meso meso){
    this.meso = meso;}

    public Meso getMeso(){
		return meso;
	}

    public void setSir(Sir sir){
    this.sir = sir;}

    public Sir getSir(){
		return sir;
	}

	


	
	public void dodajSos(Sos sos) {
		sosevi.add(sos);
	}
	
	public void dodajSalatu(Salata salata) {
		salate.add(salata);
	}
	
	
	
	@Override
	public boolean daLiJeLjuto() {
        		if(meso.getDaLiJeLjuta() == true || sir.getDaLiJeLjuta() == true){
        			return true;}
		for(Sos sos: sosevi) {
        		if (sos.getDaLiJeLjuta() == true) {
						return true;}}
			for(Salata salata:salate) {
				if (salata.getDaLiJeLjuta()== true) {
					return true;}
				}

			return false;}

	@Override
	public int cena() {
		int zbir = 0;
		zbir = meso.getCena()+sir.getCena();
		for(Sos sos: sosevi) {
				zbir+= sos.getCena();
		}for(Salata salata:salate){
			zbir+=salata.getCena();
		}
		return zbir;}



	  
	public String toString() {
		return "\n"+ "Naziv Jela: obrok Salata" +"\n"  + "sastojci su: " + "\n" + "1." + meso + "\n" + "2." +sir +  "\n" +"3"
		+ sosevi  + "\n" + "4" + salate+ "\n";
	}


}
