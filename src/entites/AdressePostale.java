package entites;

public class AdressePostale {

	public int numeroDeRue = 0;
	public String nomRue = "";
	public String ville = "";
	public int codePostal = 0;

	// tp1
	//constructeur par defaut 
	public AdressePostale() {

	}

	// tp2
	//constructeur avec tous les attribus
	public AdressePostale(int numeroDeRue, String nomRue, String ville, int codePostal) {
		this.numeroDeRue = numeroDeRue;
		this.nomRue = nomRue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	
	
	public String toString() {
		return "n° =>" + this.numeroDeRue +"  rue => "+ this.nomRue + " ville =>" + this.ville+ " "+
				" code postal =>" + this.codePostal;
	}
	public void afficheAdresse() {

		System.out.println("n° =>" + this.numeroDeRue + " rue =>" + this.nomRue + " ville =>" + this.ville
				+ " code postal =>" + this.codePostal);
	}

}
