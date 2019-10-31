
public class PriseEnCharge {
	
	private int num;
	private DateP dateRetour;
	private int kmParcourus;
	
	
	public PriseEnCharge()
	{
		
	}
	
	public PriseEnCharge(int num , DateP dateRetour , int kmParcourus )
	{
		this.num=num;
		
		this.dateRetour= new DateP();
		this.dateRetour=dateRetour;
		
		this.kmParcourus=kmParcourus;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public DateP getDateRetour() {
		return dateRetour;
	}
	
	public void setDateRetour(DateP dateRetour) {
		this.dateRetour = dateRetour;
	}
	
	public int getKmParcourus() {
		return kmParcourus;
	}

	public void setKmParcourus(int kmParcourus) {
		this.kmParcourus = kmParcourus;
	}
	
	public String toString()
	{
		return ( "N° : "+num+"\nDate retour : "+dateRetour+"\nKilometres parcourus : "+kmParcourus );
	}
	
	public void affiche()
	{
		System.out.println(this);
	}
	
	public int calculerMontant(int prixKm , int kmParcourus , int prixV , int duree)
	{
		return ( (prixKm*kmParcourus)+(prixV*duree) );
	}
	
	
}
