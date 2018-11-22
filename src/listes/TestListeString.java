package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestListeString {

	public static void main(String[] args) {
		/*Dans cette classe instanciez une ArrayList de String contenant les éléments suivants :
			o Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
			• Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
			• Modifiez le contenu de la liste de manière à mettre tous les noms de villes en
			majuscules.
			• Supprimez de la liste les villes dont le nom commence par la lettre N.
			• Affichez la liste résultante
		*/
		String[] tab = {"Nice","Carcassonne","Narbonne","Lyon","Foix","Pau","Marseille","Tarbes"};
		ArrayList<String> list = new ArrayList<String>();
		
		list.addAll(Arrays.asList(tab));
		System.out.println(Collections.max(list));
		String longest ="";
		for (String string : list) {
			//pour trouver le mot le plus long
			if(string.length()>longest.length()) {
				longest = string;
			}
			System.out.println(string.toUpperCase());
			
		}
		System.out.println("la ville qui a le plus de lettre est => "+longest);
		for (int i=0;i<list.size();i++) {
			//pour trouver le ville qui commence par un N
			if(list.get(i).charAt(0)=='N') {
				list.remove(list.get(i));
			}else {
				System.out.println(list.get(i));
			}
		}
	}

}
