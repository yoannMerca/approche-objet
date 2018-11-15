package entites;

public class Personne {
	public String nom = "";
	public String prenom = "";
	public AdressePostale adresse = new AdressePostale();
	
	//tp3
	 int anneeNaissance = 0;
	
	
	
	
	//tp1
	public Personne() {

	}
	
	//tp2
	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public void affichePersonne() {
		System.out.print("nom =>" + this.nom + " prenom => " + this.prenom+" ");
		adresse.afficheAdresse();
	}
	
	
	
	
	//tp3
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdresse() {
		return adresse;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	

	public int getAnneeNaissance() {
		return anneeNaissance;
	}
	public int getAge() {
	
		return  2018 - getAnneeNaissance();
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

	public String toString() {
		return "nom =>" +this.nom.toUpperCase()+" prenom => " + this.prenom.toLowerCase()+" ";
	}

}
