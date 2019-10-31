
public class Facture {
	
	private int numFacture;
	private Contrat contrat;
	private int prix;
	
	public Facture()
	{
		
	}
	
	public Facture(int numFacture, Contrat contrat , int prix)
	{
		this.setNumFacture(numFacture);
		this.setContrat(new Contrat());
		this.prix=prix;
		
	}

	
	public int getNumFacture() {
		return numFacture;
	}


	public void setNumFacture(int numFacture) {
		this.numFacture = numFacture;
	}

	
	public Contrat getContrat() {
		return contrat;
	}

	
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	
	public int getPrix() {
		return prix;
	}

	
	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String toString()
	{
		return ( "N° Facture : "+numFacture+"\nPrix : "+prix +"\nContrat :\n"+ contrat.toString() );
	}
	
	public void affiche()
	{
		System.out.println(toString());
	}
	
	
}
