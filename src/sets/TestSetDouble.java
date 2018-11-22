package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class TestSetDouble {

	public static void main(String[] args) {
		/*
		 * Dans cette classe instanciez un HashSet de doubles et placez y les éléments
		 * suivants : o 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01 • Affichez tous les
		 * éléments de la collection • Recherchez le plus grand élément de la collection
		 * • Supprimez le plus petit élément de la collection • Recherchez tous les
		 * éléments négatifs et modifiez les de manière à ce qu’ils deviennent positifs.
		 * • Affichez enfin le contenu de la collection ainsi modifiée
		 */

		HashSet<Double> tab = new HashSet<Double>();
		Double[] dou = { 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01 };

		tab.addAll(Arrays.asList(dou));

		System.out.print(tab);
		
		//affiche le nbr le plus grand
		System.out.print("\n\r[" + Collections.max(tab) + "]\n\r");
		
		//supprime  le nbr le plus petit
		tab.remove(Collections.min(tab));

		System.out.print("\n\r"+tab);

		//creation d'un deuxieme hashset pour pouvoir modifier les valeurs négative
		HashSet<Double> tab2 = new HashSet<Double>();
		
		for (Double value : tab) {
			if (value < 0) {	
				tab2.add(Math.abs(value));
			}else {
				tab2.add(value);
			}
		}
		tab.clear();
		tab.addAll(tab2);
		System.out.print("\n\r"+tab);
	}

}
