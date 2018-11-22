package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
	public static void main(String[] arg) {
		ArrayList<Integer> tab = new ArrayList<Integer>();
		
		/*Dans cette classe instanciez une ArrayList d’entiers et placez y les éléments suivants :
		o -1, 5, 7, 3, -2, 4, 8, 5
		• Affichez tous les éléments de la liste
		• Recherchez le plus grand élément de la liste
		• Supprimez le plus petit élément de la liste
		• Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent
		positifs.
		• Affichez enfin la liste résultante
		*/
		
		
		tab.add(-1);
		tab.add(5);
		tab.add(7);
		tab.add(3);
		tab.add(-2);
		tab.add(4);
		tab.add(8);
		tab.add(5);
		for (Integer value : tab) {
			System.out.print("["+value+"]");
		}
		System.out.println();
		System.out.println(Collections.max(tab));
		System.out.println(Collections.min(tab));
		tab.remove(Collections.min(tab));
		for (Integer value : tab) {
			System.out.print("["+value+"]");
		}
		System.out.println("----------------------------------------");
		for (Integer value : tab) {
			if(value<0) {
				tab.set(tab.indexOf(value), (value+(-value)));
			}	
		}
		for (Integer value : tab) {
			System.out.print("["+value+"]");
		}
	}
}
