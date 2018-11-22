package maps;

import java.util.HashMap;
import java.util.Scanner;

import sets.Pays;

public class TestMapPays {

	public static void main(String[] args) {
		/*Créez un HashMap avec une clé le type String et une valeur de type Pays.
			• Stockez dans cette map, les pays du TP 8 avec en clé le nom du pays et en valeur le pays.
			• Ecrivez ensuite un algorithme qui propose 3 options à l’utilisateur :
			o 1 - Afficher les informations concernant un pays
			o 2 - Supprimer un pays
			o 3 - Afficher la liste des pays
			o Si l’option 1 est choisie, le programme demande un nom de pays à l’utilisateur
			puis affiche les informations associées à ce pays:
			▪ Nom du pays
			▪ Nombre d’habitants
			▪ PIB/habitant
			▪ PIB total
			o Si l’option 2 est choisie, le programme demande un nom de pays à supprimer,
			puis le programme supprime le pays en question.
			o Si l’option 3 est choisie, le programme affiche les pays contenus dans la map.
			• Instructions :
			o Si le pays n’existe pas, le programme affiche un message indiquant à l’utilisateur
			de faire un autre choix
		 */
		
		Pays[] tabPays = {new Pays("USA",512_596_403L,59_495L),new Pays("France",67_804_000L,43_551L),
				new Pays("Allemagne",82_521_653L,50_206L),new Pays("UK",66_040_229L,43_620L),
				new Pays("Italie",60_589_445L,37_970L),new Pays("Japon",126_820_000L,42_203L),
				new Pays("Chine",1_415_045_928L,16_624L),new Pays("Russie",146_544_710L,27_900L),
				new Pays("Inde",1_355_621_800L,7_200L)};
		
		HashMap<String, Pays> pays = new HashMap<String, Pays>();
		
		for (Pays p : tabPays) {
			pays.put(p.getName(), p);
		}
		
		boolean end = false;
		Scanner scan = new Scanner(System.in);
		while(!end) {
			
			System.out.println("o 1 - Afficher les informations concernant un pays\r\n" + 
					"o 2 - Supprimer un pays\r\n" + 
					"o 3 - Afficher la liste des pays");
			
			int value = scan.nextInt();
			scan.nextLine();
			switch (value) {
			case 1:
				
				System.out.println("entrez le nom du pays");
				String name = scan.nextLine();
				if(pays.containsKey(name)) {
					System.out.println(pays.get(name));
				}
				System.out.println("Ce pays n'existe pas");
				break;
			case 2:
				System.out.println("entrez le nom du pays");
				String nameDelete = scan.nextLine();
				if(pays.containsKey(nameDelete)) {
					pays.remove(nameDelete);
				}
				System.out.println("Ce pays n'existe pas");
				break;
			case 3:
				System.out.println(pays);
				break;
			case 4:
			default:
				System.out.println("Fin du programme ");
				end = true;
			
				break;
			}
		}
		
		scan.close();
		
	}

}
