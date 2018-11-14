package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne perso1 = new Personne();
		
		perso1.adresse.codePostal = 345;
		perso1.adresse.nomRue ="plop";
		perso1.adresse.ville = "mtp";
		perso1.adresse.numeroDeRue = 1;
		
		perso1.nom =" mon nom";
		perso1.prenom =" mon prenom";

		perso1.affichePersonne();

	}

}
