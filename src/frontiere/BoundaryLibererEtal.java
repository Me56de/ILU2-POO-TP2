package frontiere;

import controleur.ControlLibererEtal;
import villagegaulois.Etal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		Etal vendeurReconnu;
		vendeurReconnu = controlLibererEtal.isVendeur(nomVendeur);
		if (vendeurReconnu==null) {
			System.out.println("Mais vous n'êtes pas inscrit sur notre marché aujourd'hui !\n");
		}
		else {
			controlLibererEtal.libererEtal(nomVendeur);
			
		}
	}

}
