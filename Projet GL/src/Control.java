import java.util.ArrayList;
import java.util.Date;

public class Control {
	
	
	
	
	DirecteurCommercial DC;
	
	Client client;
	
	static ArrayList<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();
	
	static ArrayList<Administateur> listeAdmins = new ArrayList<Administateur>();
	
	static ArrayList<DirecteurCommercial> listeDC = new ArrayList<DirecteurCommercial>();
	
	
	
	static ArrayList<Client> listeClients = new ArrayList<Client>();
	
	static ArrayList<Vehicule> listeVehicule = new ArrayList<Vehicule>();
	
	static ArrayList<Reservation> listeReservations = new ArrayList<Reservation>();
	
	static ArrayList<Contrat> listeContrats = new ArrayList<Contrat>();
	
	static ArrayList<Facture> listeFactures = new ArrayList<Facture>();
	
	
	public int calculerMontant(int prixKm , int kmParcourus , int prixV , int duree)
	{
		return ( (prixKm*kmParcourus)+(prixV*duree) );
	}
	
	
	public boolean VerifierEgaux(int a , int b )
	{
		return a==b;
	}
	
	public boolean anneeBis(int a)
	{
		if( a%4==0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	public boolean anneeExiste( int a)
	{
		if( a<1950 || a>2050 )
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	public boolean testDate(int j,int m,int a)
	{
		if ( anneeExiste(a)==false)
		{
			return false;
		}
		
		if( j<1 || j>31 )
		{
			return false;
		}
		
		if( m<1 || m>12)
		{
			return false;	
		}
		
		if( (j==30 && m==2) || ( j==31 && m==2 ) )
		{
			return false;
		}
		
		if( (j==31 && m==4) || (j==31 && m==6) || (j==31 && m==9) || (j==31 && m==11) )
		{
			return false;
		}
		
		if ( j==29 && m==2 && anneeBis(a)==false )
		{
			return false;
		}
		
		
		return true;
	}
	
	public boolean alphabet(char c)
	{
		boolean v=false;
		char a='a'; 
		char A='A';
		while( (a<='z') && (v==false) )
		{
			if(c==a)
			{
				v=true;
			}
			a++;
		}
		while( (A<='Z') && (v==false) )
		{
			if(c==A)
			{
				v=true;
			}
			A++;
		}
		return v;
	}

	public boolean num(char c)
	{
		boolean v=false;
		char i='0'; 
		while( (i<='9') && (v==false) )
		{
			if(c==i)
			{
				v=true;
			}
			i++;
		}
		return v;
	}

	
	public boolean textOnly(String s)
	{
		for(int i=0; i<s.length();i++)
		{
			if( !alphabet(s.charAt(i)) )
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean numbersOnly(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if( !num(s.charAt(i)) )
			{
				return false;
			}
		}
		return true;
	}
/*	
	public DateP calculerDate(DateP date , int duree)
	{
		DateP dateRetour = new DateP();
		boolean b=false;
		int rest;
		if(date.getm()==1 || date.getm()==3 || date.getm()==5 || date.getm()==7 || date.getm()==8 || date.getm()==10 )
		{
			if((date.getj()+duree)<=31)
			{
				dateRetour.setj(date.getj()+duree);
				dateRetour.setm(date.getm());
				dateRetour.seta(date.geta());
			}
			else
			{
				b=true;
				while( ((date.getj()+duree)>=31) && b==true )
				{
					rest = 31 - (date.getj()+duree);
					dateRetour.setm(date.getm()+1);
					dateRetour.setj();
				}
			
			}
		}
		return dateRetour;
	}
*/
/*	
	public DateP entreDates(DateP d , int duree)
	{
		DateP dateFinal =new DateP();
		DateP dateRetour = new DateP();
		int sub;
		if(d.getm()==1 || d.getm()==3 || d.getm()==5 || d.getm()==7 || d.getm()==8 || d.getm()==10 )
		{
			if((d.getj()+duree)>31)
			{
				dateRetour.setj(d.getj()+duree-31);
				dateRetour.setm(d.getm()+1);
				dateRetour.seta(d.geta());
				sub = 
				return entreDates(dateRetour , );
			}
			else
			{
				dateRetour.setj(d.getj()+duree);
				dateRetour.setm(d.getm());
				dateRetour.seta(d.geta());
			}
		}
		if(d.getm()==4 || d.getm()==6 || d.getm()==9 ||d.getm()==11)
		{
			if((d.getj()+duree)>30)
			{
				dateRetour.setj(d.getj()+duree-30);
				dateRetour.setm(d.getm()+1);
				dateRetour.seta(d.geta());
			}
			else
			{
				dateRetour.setj(d.getj()+duree);
				dateRetour.setm(d.getm());
				dateRetour.seta(d.geta());
			}
		}
		if(d.getm()==12)
		{
			if((d.getj()+duree)>30)
			{
				dateRetour.setj(d.getj()+duree-30);
				dateRetour.setm(d.getm()+1);
				dateRetour.seta(d.geta()+1);
			}
			else
			{
				dateRetour.setj(d.getj()+duree);
				dateRetour.setm(d.getm());
				dateRetour.seta(d.geta());
			}
		}
		if(d.getm()==2)
		{
			if(anneeBis(d.geta())==true)
			{
				if((d.getj()+duree)>29)
				{
					dateRetour.setj(d.getj()+duree-29);
					dateRetour.setm(d.getm()+1);
					dateRetour.seta(d.geta());
				}
				else
				{
					dateRetour.setj(d.getj()+duree);
					dateRetour.setm(d.getm());
					dateRetour.seta(d.geta());
				}
			}
			else
			{
				if((d.getj()+duree)>28)
				{
					dateRetour.setj(d.getj()+duree-28);
					dateRetour.setm(d.getm()+1);
					dateRetour.seta(d.geta());
				}
				else
				{
					dateRetour.setj(d.getj()+duree);
					dateRetour.setm(d.getm());
					dateRetour.seta(d.geta());
				}
			}
		}
		
		
		
		
		
		
		
		return dateRetour;
	}
	*/

	
	public int joursDate(DateP d)
	{
		
		int js=0;
		int jrs=0;
		
		for( int j=1; j< d.getm() ; j++)
		{
			if( j==1 || j==3 || j==5 || j==7 || j==8 || j==10 || j==12 )
			{
				js=js+31; 
			}
			
			if( j==4 || j==6 || j==9 || j==11)
			{
				js=js+30;
			}

			if(j==2)
			{
				if(anneeBis(d.geta())==true)
				{
					js=js+29;
				}
				else
				{
					js=js+28;
				}
			}
		}
		
		js=js+d.getj();
		
		for(int i=1 ; i<d.geta() ; i++)
		{
			if(anneeBis(i))
			{
				jrs= jrs + 366;
			}
			else
			{
				jrs = jrs + 365;
			}
		}
		
		int fin;
		fin=js+jrs;
		
		return fin;
	}
	
	
}
