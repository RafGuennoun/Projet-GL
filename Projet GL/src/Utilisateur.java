

public class Utilisateur extends Personne{
	
	private String poste;
	private String salaire;
	private String matricule;
	
	public Utilisateur()
	{
		
	}
	
	public Utilisateur(String nom, String prenom, DateP d, String poste, String sav, String matricule)
	{
		super(nom,prenom,d);
		this.setPoste(poste);
		this.setSalaire(sav);
		this.setMatricule(matricule);
	}

	
	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getSalaire() {
		return salaire;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}

	
	public String getMatricule() {
		return matricule;
	}

	
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String toString()
	{
		return ( super.toString()+" "+poste+" "+salaire+"DA\n"  );
	}
	
	public void affiche()
	{
		System.out.println(toString());
	}
	
	public String description()
	{
		return ( "Nom : "+nom  + "\nPrenom : "+prenom + "\nDate de naissance : "+ D.toString()+"\nMatricule : "+matricule+"\nPoste : "+poste+"\nSalair : "+salaire+" DA");
	}
	
	
}
