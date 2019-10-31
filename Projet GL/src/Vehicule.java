
public class Vehicule {

	private String matricule;
	private String nom;
	private String marque;
	private int nbPlaces;
	private static int nbExmp=1;
	private int prix;
	private String type;
	private String couleur;
	private int km; // kilometrage
	private boolean louee=false;
	
	public Vehicule()
	{
		
	}
	
	public Vehicule( String matricule, String nom, String marque, int nbPlaces, int prix,String type, String couleur, int km )
	{
		this.setMatricule(matricule);
		this.setNom(nom);
		this.setMarque(marque);
		this.setNbPlaces(nbPlaces);
		this.setPrix(prix);
		this.type=type;
		this.setCouleur(couleur);
		this.setKm(km);
	}

	
	public String getNom() {
		return nom;
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbPlaces() {
		return nbPlaces;
	}


	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	
	public String getMatricule() {
		return matricule;
	}

	
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	
	public int getNbExmp() {
		return nbExmp;
	}

	
	public void setNbExmp(int nbExmp) {
		Vehicule.nbExmp = nbExmp;
	}

	
	public int getPrix() {
		return prix;
	}

	
	public void setPrix(int prix) {
		this.prix = prix;
	}

	
	public String getMarque() {
		return marque;
	}

	
	public void setMarque(String marque) {
		this.marque = marque;
	}

	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	
	public String getCouleur() {
		return couleur;
	}

	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	
	public int getKm() {
		return km;
	}

	
	public void setKm(int km) {
		this.km = km;
	}

	
	public boolean isLouee() {
		return louee;
	}

	
	public void setLouee(boolean louee) {
		this.louee = louee;
	}
	
	public String toString()
	{
		return ("Matricule : "+ matricule+"\nMarque : "+ marque+"\nNom : "+nom+"\nCouleur : "+couleur+"nb places : " +nbPlaces+" places\nPrix : "+prix+"Da | "+km+"KM\nType : "+type+" " );
	}
	
	public void affiche()
	{
		System.out.println(this);
	}
	
	public void description()
	{
		System.out.println("Matricule : "+matricule);
		System.out.println("Marque : "+marque);
		System.out.println("Nom : "+nom);
		System.out.println("Couleur du vehilcule : "+couleur);
		System.out.println("Nombre de places : "+nbPlaces);
		System.out.println("Type du vehilcule : "+type);
		System.out.println("Kilometrage du vehilcule : "+km+" KM");
		System.out.println("Prix de location : "+prix+" DA");
		System.out.println("Exemplaires disponibles : "+nbExmp);
		
	}
	
	
	
	
}
