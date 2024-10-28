package exo1;

public abstract class document {
	String nom;
	Personne auteur1,auteur2,auteur3,auteur4,auteur5;
	static int nbrAut;
	public document() {
		
	}
	public document(String nom, Personne auteur1) {
		this();
		if(auteur1.verifAuteur()==false) {
			this.nom=nom;
			this.auteur1=auteur1;
			nbrAut=1;
		}
		else
			System.out.println(auteur1+" ne peut pas etre un auteur (moins de 15 ans)");
	}
	public document(String nom, Personne auteur1,Personne auteur2) {
		this(nom,auteur1);
		if(auteur2.verifAuteur()==false) {
			this.auteur2=auteur2;
			nbrAut=2;
		}
		else
			System.out.println(auteur2+" ne peut pas etre un auteur (moins de 15 ans)");
		
	}
	public document(String nom, Personne auteur1,Personne auteur2,Personne auteur3) {
		this(nom,auteur1,auteur2);
		if(auteur3.verifAuteur()==false) {
			this.auteur3=auteur3;
			nbrAut=3;
		}
		else
			System.out.println(auteur3+" ne peut pas etre un auteur (moins de 15 ans)");
		
	}
	public document(String nom, Personne auteur1,Personne auteur2,Personne auteur3,Personne auteur4) {
		this(nom,auteur1,auteur2,auteur3);
		if(auteur4.verifAuteur()==false) {
			this.auteur4=auteur4;
			nbrAut=4;
		}
		else
			System.out.println(auteur4+" ne peut pas etre un auteur (moins de 15 ans)");
		
	}
	public document(String nom, Personne auteur1,Personne auteur2,Personne auteur3,Personne auteur4,Personne auteur5) {
		this(nom,auteur1,auteur2,auteur3,auteur4);
		if(auteur5.verifAuteur()==false) {
			this.auteur5=auteur5;
			nbrAut=5;
		}
		else
			System.out.println(auteur5+" ne peut pas etre un auteur (moins de 15 ans)");
		
	}
	public int nbrAuteur() {
		return nbrAut;
	}
	public String toString() {
		if(nbrAut==1)
			return "nom du livre: "+nom+" auteur(s): "+auteur1;
		else {
			if(nbrAut==2)
				return "nom du livre: "+nom+" auteur(s): "+auteur1+", "+auteur2;
			else {
				if(nbrAut==3)
					return "nom du livre: "+nom+" auteur(s): "+auteur1+", "+auteur2+", "+auteur3;
				else {
					if(nbrAut==4)
						return "nom du livre: "+nom+" auteur(s): "+auteur1+", "+auteur2+", "+auteur3+", "+auteur4;
					else
						return "nom du livre: "+nom+" auteur(s): "+auteur1+", "+auteur2+", "+auteur3+", "+auteur4+", "+auteur5;
				}
			}
		}
	};
}
