package produit;

public class Sanglier extends Produit{
	private int poids;
	private String chasseur;
	
	public Sanglier(int poids, String chasseur) {
		super("Sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	public void decrireProduit() {
		System.out.println("sanglier de " +poids + "kg chassé par " +chasseur+".");
	}
}
