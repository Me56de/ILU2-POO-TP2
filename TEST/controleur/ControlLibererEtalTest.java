package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;


class ControlLibererEtalTest {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation ...");
		village = new Village("Le village des irréductibles", 10, 5);
		controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}
	
	@Test
	void testControlLibererEtal() {
		ControlLibererEtal controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		assertNotNull(controlLibererEtal);
	}


	@Test
	void testisVendeurl() {
		ControlLibererEtal controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);		
		Gaulois bonemine = new Gaulois("Bonemine", 2);
		village.ajouterHabitant(bonemine);
		village.installerVendeur(bonemine, "gucci", 20);
		assertTrue(controlLibererEtal.isVendeur("Bonemine"));
	}

	@Test
	void testlibererEtal() {
		fail("Not yet implemented");
	}

}
