package produit;

public class Poisson extends Produit{
	private String date;
	
	public Poisson(String date) {
		super("Poisson", Unite.PIECE);
		this.date = date;
	}

	public void decrireProduit() {
		System.out.println("poisson pêchés " + date +".");
	}
}
