import java.util.ArrayList;

public class DirecteurCommercial extends Utilisateur {
	
	public DirecteurCommercial()
	{
		
	}
	
	public DirecteurCommercial(String nom, String prenom, DateP d, String poste, String salaire, String matricule)
	{
		super(nom,prenom,d,poste,salaire,matricule);
	}
	
	// gestion des vehicules
	
		//ajouter
		// modifier
		// chercher
		// supprimer
	
	public void ajouterVehicule(Vehicule v,ArrayList<Vehicule> listeVehicules)
	{
		if(listeVehicules.contains(v)==true)
		{
			for(int i=0; i<listeVehicules.size() ; i++)
			{
				if(listeVehicules.get(i).getMatricule().equals(v.getMatricule()) && listeVehicules.get(i).getNom().equals(v.getNom()) && listeVehicules.get(i).getMarque().equals(v.getMarque()) && listeVehicules.get(i).getNbPlaces()==v.getNbPlaces() && listeVehicules.get(i).getPrix()==v.getPrix() &&  listeVehicules.get(i).getType().equals(v.getType()) && listeVehicules.get(i).getCouleur().equals(v.getCouleur()) )
				{
					listeVehicules.get(i).setNbExmp(listeVehicules.get(i).getNbExmp()+1);
				}
			}
		}
		
		else
		{
			listeVehicules.add(v);
		}
	}
	
	public boolean chercherVehicule(Vehicule v,ArrayList<Vehicule> listeVehicules)
	{
		if(listeVehicules.contains(v))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void modifierVehicule(Vehicule v1,Vehicule v2)
	{
		v1.setMarque(v2.getMarque());
		v1.setMatricule(v2.getMatricule());
		v1.setNbPlaces(v2.getNbPlaces());
		v1.setNom(v2.getNom());
		v1.setPrix(v2.getPrix());
		v1.setType(v2.getType());
		v1.setCouleur(v2.getCouleur());
		v1.setKm(v2.getKm());
	}
	
	public void supprimerVehicule(Vehicule v,ArrayList<Vehicule> listeVehicules)
	{
		listeVehicules.remove(v);
	}
	
	
	
	// gestion des clients
	
		// modifier		
		// chercher
		// supprimer
	public void ajouterClient(Client c , ArrayList<Client> listeClients)
	{
		listeClients.add(c);
	}
	
	public boolean chercherClient(Client c ,ArrayList<Client> listeClients)
	{
		if(listeClients.contains(c))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void modifierClient(Client c1 ,Client c2)
	{
		c1.setAdresse(c2.getAdresse());
		c1.setDateP(c2.getDateP());
		c1.setLieuDeNaiss(c2.getLieuDeNaiss());
		c1.setNom(c2.getNom());
		c1.setnPermis(c2.getnPermis());
		c1.setPrenom(c2.getPrenom());
		c1.setTel(c2.getTel());
		c1.setVille(c2.getVille());
	}
	
	public void supprimerClient(Client c ,ArrayList<Client> listeClients)
	{
		listeClients.remove(c);
	}
	
	// gestion des reservations 
	
		// ajouter reservation
		// ajouter client
		// etablir contrat 
	
	public void ajouterReservation(Reservation r , ArrayList<Reservation> listeReservations)
	{
		listeReservations.add(r);
	}
	
	public void modifierReservation(Reservation r1 , Reservation r2 )
	{
		r1.setNumReservation(r2.getNumReservation());
		r1.setClient(r2.getClient());
		r1.setVehicule(r2.getVehicule());
		r1.setDateReservation(r2.getDateReservation());
		r1.setDelai(r2.getDelai());
	}
	
	public boolean chercherReservataion(Reservation r , ArrayList<Reservation> listeReservations)
	{
		if(listeReservations.contains(r))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void supprimerReservation(Reservation r , ArrayList<Reservation> listeReservations)
	{
		listeReservations.remove(r);
	}
	
	
	// gestion des contrats 
		
		// modifier
		// chercher
		// supprimer
	public void ajouterContrat(Contrat contrat , ArrayList<Contrat> listeContrats )
	{
		listeContrats.add(contrat);
	}
	
	
	public boolean chercherContrat(Contrat c , ArrayList<Contrat> listeContrats)
	{
		if( listeContrats.contains(c) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void modifierContrat(Contrat c1, Contrat c2)
	{
		c1.setNumContrat(c2.getNumContrat());
		c1.setReservation(c2.getReservation());
	}
	
	public void supprimerContrat(Contrat c , ArrayList<Contrat> listeContrats)
	{
		listeContrats.remove(c);
	}
	
	// gestion des factures 
	
		
		// modifier
		// chercher
		// supprimer
	
	
	public void ajouterFacture(Facture f , ArrayList<Facture> listeFactures)
	{
		listeFactures.add(f);
	}
	
	public boolean chercherFacture(Facture f , ArrayList<Facture> listeFactures)
	{
		if(listeFactures.contains(f))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public void modifierFacture(Facture f1 , Facture f2)
	{
		f1.setNumFacture(f2.getNumFacture());
		f1.setContrat(f2.getContrat());
	}
	
	public void supprimerFacture(Facture f , ArrayList<Facture> listeFactures)
	{
		listeFactures.remove(f);
	}
	
		// cherhcher reservation 
		// ajouter facture 
	// gestion stats des reservations 
	
	

}
