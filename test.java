package exo1;

public class test {

	public static void main(String[] args) {
		Personne p = new Personne("Tahreh", "Mafi",1988);
		Livre ShatterMe = new Livre(12345,3000,2011,"Shatter Me",p);
		System.out.println("le nombre d'auteurs de "+ShatterMe.nom+" est "+ShatterMe.nbrAuteur());
		System.out.println("info sur l'auteur/les auteurs de "+ShatterMe.nom+" :"+p);
		System.out.println("info sur le livre "+ShatterMe.nom+" :"+ShatterMe+"\n");
		ShatterMe.prixVente(p);
		//cas plusierus auteurs
		Personne a1=new Personne("Jaques","Courtin",1921);
		Personne a2=new Personne("Irene","kowarski",1920);
		Livre l2 = new Livre(1234545,2500,1998,"initiation a l'algo",a1,a2);
		System.out.println("le nombre d'auteurs de "+l2.nom+" est "+l2.nbrAuteur());
		System.out.println("info sur l'auteur/les auteurs de "+l2.nom+" :"+a1+"\n"+a2);
		System.out.println("info sur le livre "+l2.nom+" :"+l2);
		
		Personne ach = new Personne("ines","benlatreche",2004);
		l2.prixVente(ach);
		//exo sup
		Personne m = new Personne("mohammed","ali",2008);
		Livre non = new Livre(123,1500,2023,"non",m);
		}
}
