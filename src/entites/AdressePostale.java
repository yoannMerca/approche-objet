package entites;

public class AdressePostale {

	public int numeroDeRue = 0;
	public String nomRue = "";
	public String ville = "";
	public int codePostal = 0;

	// tp1
	public AdressePostale() {

	}

	// tp2
	public AdressePostale(int numeroDeRue, String nomRue, String ville, int codePostal) {
		this.numeroDeRue = numeroDeRue;
		this.nomRue = nomRue;
		this.ville = ville;
		this.codePostal = codePostal;
	}

	public void afficheAdresse() {

		System.out.println("n° =>" + this.numeroDeRue + " rue =>" + this.nomRue + " ville =>" + this.ville
				+ " code postal =>" + this.codePostal);
	}

}
