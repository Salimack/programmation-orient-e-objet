package tp6_7.exo;

import java.util.ArrayList;
import java.util.List;

public class GestionPolygones {

	private List<Polygone> polygones;

	public GestionPolygones(List<Polygone> polygones) {
		this.polygones = polygones;
	}

	public GestionPolygones() {
		this.polygones = new ArrayList<>();
	}

	public void ajouterPolygone(Polygone polygone) {
		polygones.add(polygone);
	}

	public void affiche() {
		for (int i = 0; i < polygones.size(); i++) {
			System.out.println(polygones.get(i).toString());
		}
	}

	public void affichePerimetres() {
		for (int i = 0; i < polygones.size(); i++) {
			System.out.println("Perimetre : " + polygones.get(i).perimetre());
		}
	}

	public Polygone plusGrandPerimetre() {
		float max = polygones.get(0).perimetre();
		int maxindice = 0;
		for (int i = 0; i < polygones.size(); i++) {
			if (polygones.get(i).perimetre() > max) {
				max = polygones.get(i).perimetre();
				maxindice = i;
			}
		}
		return polygones.get(maxindice);
	}

	public int nombreTotal() {
		return polygones.size();
	}
}
