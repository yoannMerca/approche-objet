package tri;

import java.util.Comparator;
public class ComparatorPibHabitant implements Comparator<Pays>{
  
	
	ComparatorPibHabitant(){
	}

@Override
//compare les pays sur leur pib
public int compare(Pays o1, Pays o2) {
	Pays p1 = (Pays) o1;
    Pays p2 = (Pays) o2;
    
    int result = p1.getPib().compareTo(p2.getPib());
 
  	return result;
}

}