package tp10.exo1;
import java.util.ArrayList;
public class Personnel {
	private ArrayList<Employe> collection;
	
	public Personnel() {
	    collection = new ArrayList<Employe>();
	}
	
	void ajouterEmploye(Employe e) {
		collection.add(e);
	}
	
	void calculerSalaires() {
	    for(Employe e : collection) {
	        System.out.println(e.toString() + " gagne " + e.calculerSalaire() + " Euros.");
	    }
	}
	
	double salaireMoyen() {
		double sm=0.0;
		for(Employe e : collection) {
			sm=sm+e.calculerSalaire();
		}
		return sm/collection.size();
	}
}
