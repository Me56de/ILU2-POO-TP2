package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControlAfficherVillageTest {
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach	
	public void initialiserSituation() {
		System.out.println("Initialisation ...");
		village = new Village("Le village des irréductibles", 10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}
	
	@Test
	void testControlAfficherVillage() {
		 ControlAfficherVillage controlAfficherVillage = new ControlAfficherVillage(village);
		 assertNotNull(controlAfficherVillage);
	}

	@Test
	void testDonnerNomsVillageois() {
		ControlAfficherVillage controlAfficherVillage = new ControlAfficherVillage(village);
		Gaulois bonemine = new Gaulois("Bonemine",3);
		village.ajouterHabitant(bonemine);
		assertArrayEquals(controlAfficherVillage.donnerNomsVillageois() , new String[] {"Abraracourcix" , "Bonemine"});
	}

	@Test
	void testDonnerNomVillage() {
		ControlAfficherVillage controlAfficherVillage = new ControlAfficherVillage(village);
		assertEquals(controlAfficherVillage.donnerNomVillage() , "Le village des irréductibles");	}

	@Test
	void testDonnerNbEtals() {
		ControlAfficherVillage controlAfficherVillage = new ControlAfficherVillage(village);
		assertEquals(controlAfficherVillage.donnerNbEtals(), 5);
	}
}
	