package entites;

public class Personne {
	public String nom ="";
	public String prenom ="";
	public AdressePostale adresse = new AdressePostale();
	public void affichePersonne(){
		System.out.println("nom =>"+ this.nom +" prenom =>"+ this.prenom);
	}
}
