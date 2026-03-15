package cc2024;

public class MyDate {
	private int jour;
	private int mois;
	private int annee;
	
	public MyDate(int jour, int mois, int annee) {
		this.jour=jour;
		this.mois=mois;
		this.annee=annee;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getAnnee() {
		return annee;
	}
	
	public String toString() {
		return jour +"/"+mois+"/"+annee;
	}
}
