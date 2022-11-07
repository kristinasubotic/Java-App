package Jelo;
import Namirnica.Tortilja;
import Namirnica.Sir;

import Namirnica.Meso;
import Namirnica.*;


public class  Burrito extends ObrokSalata{
	Tortilja tortilja;
	
	public Burrito(Tortilja tortilja,Meso meso,Sir sir){
	super(meso,sir);
        this.setTortilja(tortilja);
        this.setMeso(meso);
        this.setSir(sir);

	}

    public void setMeso(Meso meso) {
		this.meso = meso;
	}
	public void setTortilja(Tortilja tortilja) {
		this.tortilja = tortilja;
	}

	public void setSir(Sir sir) {
		this.sir = sir;
	}

//sos i salata dodati

	@Override
	public int cena() {
		int zbir = 0;
		zbir = tortilja.getCena() + meso.getCena() + sir.getCena();
                for(Sos sos: sosevi) {
        		if (sos.getDaLiJeLjuta() == true) {
						zbir+= sos.getCena();}}
			for(Salata salata:salate) {
				if (salata.getDaLiJeLjuta()== true) {
					zbir+= salata.getCena();}}
		return zbir;
	}


	@Override
	public boolean daLiJeLjuto() {
				if(tortilja.getDaLiJeLjuta() == true || meso.getDaLiJeLjuta() == true  || sir.getDaLiJeLjuta() == true){
                      return true;}
                      for(Sos sos: sosevi) {
        		if (sos.getDaLiJeLjuta() == true) {
						return true;}}
			for(Salata salata:salate) {
				if (salata.getDaLiJeLjuta()== true) {
					return true;}}
				return false;

	}

	public String toString() {
		return "Burrito" + "sastojci su" + tortilja + meso + sir +sosevi +salate ;
	}

}
