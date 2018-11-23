package tri;

import java.util.ArrayList;
import java.util.Collections;

public class TestTriPays {

	public static void main(String[] args) {
		
		
		Pays[] tabPays = {new Pays("USA",512_596_403L,59_495L),new Pays("France",67_804_000L,43_551L),
					new Pays("Allemagne",82_521_653L,50_206L),new Pays("UK",66_040_229L,43_620L),
					new Pays("Italie",60_589_445L,37_970L),new Pays("Japon",126_820_000L,42_203L),
					new Pays("Chine",1_415_045_928L,16_624L),new Pays("Russie",146_544_710L,27_900L),
					new Pays("Inde",1_355_621_800L,7_200L)};
		
		ArrayList<Pays> pays = new ArrayList<Pays>();
		Collections.addAll(pays, tabPays);
		System.out.println(pays);
		Collections.sort( pays);
		System.out.println("---------------------------trie par nom----------------------");
		System.out.println(pays);
		System.out.println("-------------------------------------------------");
		System.out.println("---------------------------trie par nbr d hab----------------------");
		System.out.println("-------------------------------------------------");
		Collections.sort( pays, new ComparatorHabitant());
		System.out.println(pays);
		System.out.println("-------------------------------------------------");
		System.out.println("---------------------------trie par PIB / hab----------------------");
		System.out.println("-------------------------------------------------");
		Collections.sort( pays, new ComparatorPibHabitant());
		System.out.println(pays);
	}
}
