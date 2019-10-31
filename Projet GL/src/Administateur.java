import java.util.ArrayList;

public class Administateur extends Utilisateur{
	
	public Administateur()
	{
		
	}
	
	public Administateur(String nom, String prenom, DateP d, String poste, String salaire, String matricule)
	{
		super(nom,prenom,d,poste,salaire,matricule);
	}
	
	// Gerer utilisateurs
	
	public void ajouterUtilisateur(Utilisateur ut,ArrayList<Utilisateur> listeUtilisateurs)
	{
		listeUtilisateurs.add(ut);
	}
	
	public boolean chercherUtilisateur(Utilisateur ut,ArrayList<Utilisateur> listeUtilisateurs)
	{
		for(int i=0;i<listeUtilisateurs.size();i++)
		{
			if(ut==listeUtilisateurs.get(i))
			{
				return true;
			}
		}
		return false;
	}
	
	public void supprimerUtilisateur(Utilisateur ut,ArrayList<Utilisateur> listeUtilisateurs)
	{
		listeUtilisateurs.remove(ut);
	}
	
	public void modifierUtilisateur(Utilisateur ut1,Utilisateur ut2)
	{
		ut1.setNom(ut2.nom);
		ut1.setPrenom(ut2.prenom);
		ut1.setDateP(ut2.D);
		ut1.setMatricule(ut2.getMatricule());
		ut1.setPoste(ut2.getPoste());
		ut1.setPoste(ut2.getPoste());
	}
	

}
