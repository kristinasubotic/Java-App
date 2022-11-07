package Program;
import java.util.ArrayList;
import Jelo.AbstractJelo;
import java.util.ArrayList;
import Namirnica.*;
import Jelo.*;

public class Narudzbina {

	    ArrayList<AbstractJelo> stavke = new ArrayList <AbstractJelo>();

	    //public Narudzbina(AbstractJelo stavke){
	      //  this.stavke = stavke;
	 
	    
	    public ArrayList<AbstractJelo> getStavke() {

	    	return stavke;
	    }

	    public void dodajStavku(AbstractJelo jelo) {

	    	stavke.add(jelo);
	    }
	    
	    public int cena() {
	    	int zbir = 0;
	    	for(AbstractJelo j: stavke) {
	    		zbir += j.cena();
			}
	    	return zbir;
	    }
	    
	    

	    
	    public String toString() {
	        return "spisak svih stavki" + "\n"+stavke+"\n";
	    }
	}
