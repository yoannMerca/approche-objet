package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetObjet {

	public static void main(String[] args) {
		/*Créez un HashSet de pays contenant les pays suivants avec les informations correctes
			de nombre d’habitants et de PIB/Hab:
			o USA
			o France.
			o Allemagne.
			o UK.
			o Italie.
			o Japon.
			o Chine.
			o Russie.
			o Inde
			• Recherchez le pays avec le PIB/habitant le plus important
			• Recherchez le pays avec le PIB total le plus important
			• Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le
			plus petit
			• Supprimez le pays dont le PIB total est le plus petit
			• Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB
			total
		*/
		
		Pays[] tabPays = {new Pays("USA",512_596_403L,59_495L),new Pays("France",67_804_000L,43_551L),
					new Pays("Allemagne",82_521_653L,50_206L),new Pays("UK",66_040_229L,43_620L),
					new Pays("Italie",60_589_445L,37_970L),new Pays("Japon",126_820_000L,42_203L),
					new Pays("Chine",1_415_045_928L,16_624L),new Pays("Russie",146_544_710L,27_900L),
					new Pays("Inde",1_355_621_800L,7_200L)};
		
		HashSet<Pays> pays = new HashSet<Pays>();
		
		Collections.addAll(pays, tabPays);
		
		System.out.println(pays);
		//Recherchez le pays avec le PIB/hab le plus important
		Long pibHab=0L;
		Pays paysPibHab= null;
		for (Pays p : pays) {
			if(p.getPib()>pibHab) {
				paysPibHab = p;
				pibHab = p.getPib();
			}
		}
		System.out.println(" le pays avec le PIB/hab le plus important est =>"+paysPibHab.getName());
		
		
		//Recherchez le pays avec le PIB total le plus important
		Long pibMax =0L;
		Pays paysPibMax = null;
		for (Pays p : pays) {
			Long pib = p.getPopulation() * p.getPib();
			if(pib>pibMax) {
				paysPibMax = p;
				pibMax = pib;
			}
			
		}
		System.out.println(" le pays avec le PIB total le plus grand est =>"+paysPibMax.getName());
		
		
		//Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le
		//plus petit
		Long pibMin = Long.MAX_VALUE ;
		Pays paysPibMin = null;
		for (Pays p : pays) {
			Long pib = p.getPopulation() * p.getPib();
			if(pib<pibMin) {
				paysPibMin = p;
				pibMin = pib;
			}
			
		}
		System.out.println(" le pays avec le PIB total le plus petit est =>"+paysPibMin.getName()+"\n\r");
		
		
		/*Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le
			plus petit
		*/
		for (Pays p : pays) {
			
			if(p.getName().equals(paysPibMin.getName())){
				p.setName(p.getName().toUpperCase());
			}
			
		}
		System.out.println(pays);
		
		//Supprimez le pays dont le PIB total est le plus petit
		System.out.println("Supprimez le pays dont le PIB total est le plus petit");
		pays.remove(paysPibMin);
		System.out.println(pays);
		}
}
