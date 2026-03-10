package tp8_9;

public class Revue extends Document {
	private String mois;
	private int annee;
	
	public Revue(int numero,String titre,String mois,int annee) {
		super(numero,titre);
		this.mois=mois;
		this.annee=annee;
	}
	
	public String getMois() {
		return mois;
	}
	public int getAnnee() {
		return annee;
	}

	public String toString() {
		return super.toString() + ", mois : " + mois + ", annee : " + annee;
	}
}
