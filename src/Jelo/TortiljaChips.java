package Jelo;

import Namirnica.Sos;
import Namirnica.Tortilja;
import Namirnica.*;


public class TortiljaChips extends AbstractJelo {
	Tortilja chips;
	Sos sos;
	
	public TortiljaChips(Tortilja chips, Sos sos) {
		this.setChips(chips);
		this.setSos(sos);

	}
    
    public void setChips(Tortilja chips){
    this.chips = chips;}

    public void setSos(Sos sos){
    this.sos = sos;}

	@Override
	public boolean daLiJeLjuto() {
				if(chips.getDaLiJeLjuta() == true ||sos.getDaLiJeLjuta() == true) {
					return true;}
						return false;
	}

	 @Override
	    public int cena() {
		int zbir = 0;
	        zbir = chips.getCena()+sos.getCena();
		 return zbir;
	        
	    }
	  
	public String toString() {
		return "Naziv Jela: tortilja chips" +"\n"  + "sastojci su: " + "\n " + "1." + chips+ "\n" + " 2."+ sos ;
	}
}
	
