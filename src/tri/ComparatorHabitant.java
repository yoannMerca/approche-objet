package tri;

import java.util.Comparator;
public class ComparatorHabitant implements Comparator<Pays>{
  
	
	ComparatorHabitant(){
	}

@Override
// compare les pays sur leur population
public int compare(Pays o1, Pays o2) {
	Pays p1 = (Pays) o1;
    Pays p2 = (Pays) o2;
    
    int result = p1.getPopulation().compareTo(p2.getPopulation());
 
  	return result;
}

}
