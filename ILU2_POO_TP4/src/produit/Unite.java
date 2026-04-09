package produit;

public enum Unite {
	GRAMME("g"), KILOGRAMME("kg"), LITRE("l"), CENTILITRE("cl"), MILLILITRE("ml"), PIECE("piece");
	private String nom;

	private Unite(String string) {
		this.nom = string;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}
	





































