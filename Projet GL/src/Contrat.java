
public class Contrat {

	private int numContrat;
	private Reservation reservation;
	
	public Contrat()
	{
		
	}
	
	public Contrat( int numContrat , Reservation reservation)
	{
		this.numContrat=numContrat;
		
		this.setReservation(new Reservation());
		this.setReservation(reservation);
	}

	
	public int getNumContrat() {
		return numContrat;
	}

	
	public void setNumContrat(int numContrat) {
		this.numContrat = numContrat;
	}

	
	public Reservation getReservation() {
		return reservation;
	}


	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	
	public String toString()
	{
		return ( "N° : "+numContrat+"\n Reservation :\n"+reservation.toString() );
	}
	
	public void affiche()
	{
		System.out.println(toString());
	}
	
	
	
}
