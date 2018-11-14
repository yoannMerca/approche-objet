package entites;

public class AdressePostale {
		
	public int numeroDeRue = 0;
	public String nomRue ="";
	public String ville ="";
	public int codePostal = 0;
	
	public void afficheAdresse(){
		
		System.out.println("n° =>"+this.numeroDeRue +" rue =>"+ this.nomRue+" ville =>" +this.ville +" code postal =>"+this.codePostal);
	}
	
	
}
