package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		/*Dans cette classe instanciez un HashSet de String contenant les éléments suivants :
			o USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde
			• Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
			• Supprimez ce pays
			• Modifiez le contenu de la liste de manière à mettre tous les noms de pays en majuscules.
			• Affichez enfin le contenu de la collection ainsi modifiée
		 */
		HashSet<String> tab = new HashSet<String>();
		
		String[] pays = {"USA","France", "Allemagne","UK", "Japon", "Chine", "Russie" , "Inde"};
		
		tab.addAll(Arrays.asList(pays));
		
		System.out.println(tab);
		String maxPays ="";
		for (String pay : tab) {
			if(pay.length()>maxPays.length()) {
				maxPays = pay;
			}
		}
		
		tab.remove(maxPays);
		System.out.println("\r\n"+tab);
		HashSet<String> tab2 = new HashSet<String>();
		
		for (String value : tab) {
				tab2.add(value.toUpperCase());
		}
		tab.clear();
		tab.addAll(tab2);
		
		
		System.out.println("\r\n"+tab);
	}

}
