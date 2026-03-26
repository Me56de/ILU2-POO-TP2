package frontiere;

import controleur.ControlEmmenager;
import villagegaulois.Village;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;
	private Village village;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println("Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					StringBuilder ask = new StringBuilder();
					ask.append("Bienvenue villageois" + nomVisiteur + ":\n");
					ask.append("Quelle est votre force ?\n");
					int force = -1;
					force = Clavier.entrerEntier(ask.toString());
					controlEmmenager.ajouterGaulois(nomVisiteur, force);
					break;

				default:
					System.out.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		StringBuilder question = new StringBuilder();
		question.append("Bienvenue druide" + nomVisiteur + ":\n");
		question.append("Quelle est votre force ?\n");
		int force = -1;
		force = Clavier.entrerEntier(question.toString());

		question.append("Quelle est la force de potion la plus faible que vous produisez ?\n");
		int effetPotionMin = -1;
		effetPotionMin = Clavier.entrerEntier(question.toString());

		question.append("Quelle est la force de potion la plus forte que vous produisez ?\n");
		int effetPotionMax = -1;
		effetPotionMax = Clavier.entrerEntier(question.toString());

		while (effetPotionMax < effetPotionMin)
		{
			effetPotionMin = Clavier.entrerEntier(question.toString());
			effetPotionMax = Clavier.entrerEntier(question.toString());
			if (effetPotionMax < effetPotionMin) {
				System.out.println("Attention Druide, vous êtes trompé entre le minimun et le maximun\n");
			}
		}

		controlEmmenager.ajouterDruide(nomVisiteur, force, effetPotionMin, effetPotionMax);
	}
}
