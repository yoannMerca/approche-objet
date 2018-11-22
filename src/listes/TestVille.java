package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestVille {

	public static void main(String[] args) {
		/*Créez une classe Ville possédant 2 attributs : nom, nb d’habitants.
		• Créez une ArrayList de villes contenant les villes suivantes :
		o Nice, 343 000 hab.
		o Carcassonne, 47 800 hab.
		o Narbonne, 53 400 hab.
		o Lyon, 484 000 hab.
		o Foix, 9 700 hab.
		o Pau, 77 200 hab.
		o Marseille, 850 700 hab.
		o Tarbes, 40 600 hab.
		• Recherchez la ville la plus peuplée
		• Supprimez la ville la moins peuplée
		• Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		• Affichez enfin la liste résultante
		*/
		
		ArrayList<Ville> list = new ArrayList<Ville>();
		
		Ville[] villes = {new Ville("Nice",343_000),new Ville("Carcassonne",47_000),new Ville("Narbonne",53_000),new Ville("Lyon",343_000),new Ville("Foix",9_700),new Ville("Pau",77_200),new Ville("Marseille",850_700),new Ville("Tarbes",40_600)};
		
		list.addAll(Arrays.asList(villes));
		
		
		// recherche de la ville avec le plus d'hab
		int maxHab =0;
		int indexVillePlusHab=0 ;
		for (Ville ville : villes) {
			if(ville.getNbHab()>maxHab) {
				maxHab = ville.getNbHab();
				 indexVillePlusHab = list.indexOf(ville);
			}
		}
		for (Ville ville : villes) {
			System.out.println(ville.getNom()+" "+"=> "+ville.getNbHab()+" hab");
			
		}
	
		Ville vMax = list.get(indexVillePlusHab);
		System.out.println("la ville avec le plus grand nbr d'hab est "+vMax.getNom()+" "+"avec "+vMax.getNbHab()+" hab");
		
		// recherche de la ville avec le moins d'hab
		int minHab =Integer.MAX_VALUE ;
		int indexVilleMoinsHab= 0;
		for (Ville ville : list) {
			if(ville.getNbHab()<minHab) {
				minHab = ville.getNbHab();
				 indexVilleMoinsHab = list.indexOf(ville);
			}
		}
	
		
		/// delete de la ville avec le moin d'hab
		list.remove(list.get(indexVilleMoinsHab));
		
		
		for (Ville ville : list) {
			System.out.println(ville.getNom()+" "+"=> "+ville.getNbHab()+" hab");
			
		}
		// ville avec plus de 100000 hab en uppercase
		for (Ville ville : list) {
			if(ville.getNbHab()>100000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
		System.out.println("Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules");
		for (Ville ville : list) {
			System.out.println(ville.getNom()+" "+"=> "+ville.getNbHab()+" hab");
			
		}
	}

}
