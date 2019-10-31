public class Reservation {
	
	private static int numReservation;
	private Client client;
	private Vehicule vehicule;
	private DateP dateReservation;
	private int delai;
	
	public Reservation()
	{
		
	}
	
	public Reservation( Client client, Vehicule vehicule, DateP dateReservation, int delai)
	{

		
		this.setClient(new Client());
		this.setClient(client);
		
		this.setVehicule(new Vehicule());
		this.setVehicule(vehicule);
		
		this.setDateReservation(new DateP());
		this.setDateReservation(dateReservation);
		
		this.setDelai(delai);
		numReservation++;
	}

	
	public int getNumReservation() {
		return numReservation;
	}


	public void setNumReservation(int numReservation) {
		this.numReservation = numReservation;
	}

	
	public Client getClient() {
		return client;
	}

	
	public void setClient(Client client) {
		this.client = client;
	}

	
	public Vehicule getVehicule() {
		return vehicule;
	}

	
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	
	public DateP getDateReservation() {
		return dateReservation;
	}

	
	public void setDateReservation(DateP dateReservation) {
		this.dateReservation = dateReservation;
	}

	
	public int getDelai() {
		return delai;
	}

	
	public void setDelai(int delai) {
		this.delai = delai;
	}
	
	public String toString()
	{
		return ( "Reservation numero : "+numReservation+"\nDate de reservation : "+dateReservation.toString()+"\nDelai de location : "+delai+"\nClient : \n"+client.description()+"\nVehicule :\n"+vehicule.toString() );
	}
	
	
	public void affiche()
	{
		System.out.println(toString());
	}
	
	

}
