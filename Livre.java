package exo1;

public class Livre extends document {
	int ISBN;
	double prix;
	int annee;
	//constructeurs
	public Livre(int ISBN,double prix,int annee,String nom,Personne a1) {
		super(nom,a1);
		this.ISBN=ISBN;
		this.prix=prix;
		this.annee=annee;
	}
	public Livre(int ISBN,double prix,int annee,String nom,Personne a1,Personne a2) {
		super(nom,a1,a2);
		this.ISBN=ISBN;
		this.prix=prix;
		this.annee=annee;
	}
	public Livre(int ISBN,double prix,int annee,String nom,Personne a1,Personne a2,Personne a3) {
		super(nom,a1,a2,a3);
		this.ISBN=ISBN;
		this.prix=prix;
		this.annee=annee;
	}
	public Livre(int ISBN,double prix,int annee,String nom,Personne a1,Personne a2,Personne a3,Personne a4) {
		super(nom,a1,a2,a3,a4);
		this.ISBN=ISBN;
		this.prix=prix;
		this.annee=annee;
	}
	public Livre(int ISBN,double prix,int annee,String nom,Personne a1,Personne a2,Personne a3,Personne a4,Personne a5) {
		super(nom,a1,a2,a3,a4,a5);
		this.ISBN=ISBN;
		this.prix=prix;
		this.annee=annee;
	}
	//redef toString
	public String toString() {
		return "ISBN: "+ISBN+" annee de sortie "+annee+" "+super.toString();
	}
	public void prixVente(Personne p) {
		if(p==this.auteur1||p==this.auteur2||p==this.auteur3||p==this.auteur4||p==this.auteur5)
			System.out.println("le livre est gratuit");
		else {
			if(2023-p.dateNaissance<20) {
				double price = prix-prix*0.2; 
				System.out.println("le prix du livre est de "+price+" DA");
			}
			else
				System.out.println("le prix du livre est de "+prix+" DA");
		}
	}
}
