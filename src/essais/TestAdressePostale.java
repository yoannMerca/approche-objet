package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {

		//tp1
		AdressePostale adress1 = new AdressePostale();
		
		adress1.numeroDeRue = 2;
		adress1.codePostal = 5588;
		
		
		//tp2
		
		AdressePostale adress2 = new AdressePostale( 25,"de la republique"," montpel",34000);
		
		adress2.afficheAdresse();

	}

}
