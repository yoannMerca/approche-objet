package sets;

public class Pays {

	//Créez une classe Pays possédant 3 attributs : nom, nb d’habitants, PIB/habitant.
	
	private String name;
	private Long population;
	private Long pib;
	
	
	public Pays(String name, Long population, Long pib) {
		super();
		this.name = name;
		this.population = population;
		this.pib = pib;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public Long getPib() {
		return pib;
	}
	public void setPib(Long pib) {
		this.pib = pib;
	}
	

	@Override
	public String toString() {
		return "Nom=> " + name + ", population=> " + population + ", pib =>" + pib + " pib total => "+ pib*population  +"\r\n";
	}
	
	
}
