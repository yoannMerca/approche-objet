package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		//tp1
		Personne perso1 = new Personne();
		
		perso1.adresse.codePostal = 345;
		perso1.adresse.nomRue ="plop";
		perso1.adresse.ville = "mtp";
		perso1.adresse.numeroDeRue = 1;
		
		perso1.nom =" mon nom";
		perso1.prenom =" mon prenom";

		perso1.affichePersonne();
		
		//tp2
		AdressePostale adress = new AdressePostale(12, "thym", "lunel", 34400);
		Personne perso2 = new Personne("mercadier", "yo", adress);
		perso2.affichePersonne();
		Personne perso3 =  new Personne("mercAdier", "Yo", adress);
		 
		System.out.println("perso 3 =>"+perso3.toString());
		
		//tp3
		Personne perso4 = new Personne();
		perso4.setNom("smith");
		perso4.setPrenom("will");
		
		perso4.setAdresse(adress);
		
		System.out.println("perso 4 =>"+perso4.toString()); 
		Personne perso5 = new Personne();
		perso5.setAnneeNaissance(1987);
		
		System.out.println(perso5.getAge());
	}
	
	

}
