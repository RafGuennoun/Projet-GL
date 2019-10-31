
public class Client extends Personne{
	
	private String lieuDeNaiss;
	private int nPermis;
	private String adresse;
	private String ville;
	private String tel;
	
	public Client()
	{
		
	}

	public Client(String nom, String prenom, DateP d, String lieuDeNaiss, int nPermis, String adresse, String ville, String tel)
	{
		super(nom,prenom,d);
		this.setLieuDeNaiss(lieuDeNaiss);
		this.setnPermis(nPermis);
		this.setAdresse(adresse);
		this.setVille(ville);
		this.setTel(tel);
	}


	public String getLieuDeNaiss() {
		return lieuDeNaiss;
	}

	
	public void setLieuDeNaiss(String lieuDeNaiss) {
		this.lieuDeNaiss = lieuDeNaiss;
	}

	
	public int getnPermis() {
		return nPermis;
	}


	public void setnPermis(int nPermis) {
		this.nPermis = nPermis;
	}

	
	public String getAdresse() {
		return adresse;
	}

	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getVille() {
		return ville;
	}

	
	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getTel() {
		return tel;
	}

	
	public void setTel(String tel) {
		this.tel = tel;
	}
	

	public String toString()
	{
		return ( super.toString() +" "+lieuDeNaiss+" "+nPermis+" "+adresse+" "+ville+" "+tel  );
	}
	
	public void affiche()
	{
		System.out.println(toString());
	}

	
	public String description()
	{
	
		return ( super.toString() +"\nLieu de naissance : "+lieuDeNaiss+"\nNumero de permis : "+nPermis+"\nAdresse : "+adresse+"\nVille : "+ville +"\nNumero de telephone : "+tel );
		
		
	}
}
