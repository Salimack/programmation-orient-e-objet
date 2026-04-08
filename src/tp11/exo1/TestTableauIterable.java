package tp11.exo1;

public class TestTableauIterable {

	public static void main(String[] args) {
		String[] jours = {"Lundi", "Mardi", "Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
		TableauIterable<String> ti = new TableauIterable<String>(jours);
		
		for(int i=0;i<ti.size();i++) {
			System.out.println(ti.get(i));
		}
	}

}
