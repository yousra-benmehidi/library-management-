package exo1;

public class Personne {
	String nom,prenom;
	int dateNaissance;
	public Personne(String nom,String prenom,int dateNaissance) {
		this.nom=nom;
		this.prenom=prenom;
		this.dateNaissance=dateNaissance;
	}
	public String toString() {
		return nom+" "+prenom+" né(e) en "+dateNaissance;
	}
	public boolean verifAuteur() {
		if(2023-dateNaissance<15)
			return true;
		else
			return false;
	}
}
