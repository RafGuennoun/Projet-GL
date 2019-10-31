
public class Personne {
	
	protected String nom;
	protected String prenom;
	protected DateP D;
	
	
	//Constructeur Personne : 
	public Personne(String nom , String prenom , DateP D )
	{
		this.setNom(nom);
		this.setPrenom(prenom);
		this.D= new DateP();
		this.D=D;
		
	}

	public Personne()
	{
		nom=""; 
		prenom="";
		D=new DateP();
	}
	
	
	// Getter + Setter nom : 
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	// Getter + Setter prenom : 
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setDateP(DateP D)
	{	
		this.D=D;
	}
	
	public DateP getDateP()
	{
		return this.D;
	}

	public String description()
	{
		return ( "Nom : "+nom +"\nPrenom : "+ prenom +"\nDate de naissance :"+ D.toString());
	}
	
	public String toString()
	{
		return ( nom +"  "+ prenom +"  "+ D.toString());
	}

	public void affiche()
	{
		System.out.println(toString());
	}
}
