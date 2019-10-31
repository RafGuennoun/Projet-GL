import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class NvlReservation extends JFrame {

	private JPanel contentPane;
	private JTextField nomC;
	private JTextField prenomC;
	private JTextField jc;
	private JTextField mc;
	private JTextField ac;
	private JTextField lieuC;
	private JTextField nPermis;
	private JTextField adr;
	private JTextField ville;
	private JTextField tel;
	private JLabel lblReservationN;
	private JTextField numR;
	private JLabel lblCoordonnesClient;
	private JLabel lblNVehicule;
	private JTextField couleur;
	private JLabel lblNom;
	private JTextField nomV;
	private JLabel lblNombreDePlaces;
	private JTextField nbp;
	private JLabel lblType;
	private JLabel lblMarque;
	private JTextField marque;
	private JComboBox comboBox;
	private JLabel lblCoordonnesVehicule;
	private JLabel lblReservation;
	private JLabel lblJours;
	private JTextField jr;
	private JLabel label_6;
	private JTextField mr;
	private JLabel label_7;
	private JTextField ar;
	private JLabel lblDelaiDeReservation;
	private JTextField delaiR;
	private JButton btnReserver;
	private JButton btnRetour;
	private JLabel lblLocdz;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NvlReservation frame = new NvlReservation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	Control cont = new Control();
	
	public NvlReservation() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 20, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomClient = new JLabel("Nom client  : ");
		lblNomClient.setBounds(95, 291, 125, 34);
		lblNomClient.setForeground(Color.WHITE);
		lblNomClient.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNomClient);
		
		nomC = new JTextField();
		nomC.setBounds(221, 297, 253, 25);
		nomC.setHorizontalAlignment(SwingConstants.CENTER);
		nomC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomC.setColumns(10);
		contentPane.add(nomC);
		
		JLabel lblPrenomClient = new JLabel("Prenom client :");
		lblPrenomClient.setBounds(95, 329, 147, 31);
		lblPrenomClient.setForeground(Color.WHITE);
		lblPrenomClient.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblPrenomClient);
		
		prenomC = new JTextField();
		prenomC.setBounds(244, 333, 230, 25);
		prenomC.setHorizontalAlignment(SwingConstants.CENTER);
		prenomC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prenomC.setColumns(10);
		contentPane.add(prenomC);
		
		JLabel label_2 = new JLabel("J : ");
		label_2.setBounds(95, 409, 35, 31);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label_2);
		
		jc = new JTextField();
		jc.setBounds(129, 413, 82, 25);
		jc.setHorizontalAlignment(SwingConstants.CENTER);
		jc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jc.setColumns(10);
		contentPane.add(jc);
		
		JLabel label_3 = new JLabel("M : ");
		label_3.setBounds(221, 409, 44, 31);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label_3);
		
		mc = new JTextField();
		mc.setBounds(252, 413, 82, 25);
		mc.setHorizontalAlignment(SwingConstants.CENTER);
		mc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mc.setColumns(10);
		contentPane.add(mc);
		
		JLabel label_4 = new JLabel("A : ");
		label_4.setBounds(344, 409, 44, 31);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label_4);
		
		ac = new JTextField();
		ac.setBounds(372, 413, 102, 25);
		ac.setHorizontalAlignment(SwingConstants.CENTER);
		ac.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ac.setColumns(10);
		contentPane.add(ac);
		
		JLabel lblLieuDeNaissance = new JLabel("Lieu   : ");
		lblLieuDeNaissance.setBounds(95, 445, 82, 31);
		lblLieuDeNaissance.setForeground(Color.WHITE);
		lblLieuDeNaissance.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblLieuDeNaissance);
		
		lieuC = new JTextField();
		lieuC.setBounds(168, 449, 306, 25);
		lieuC.setHorizontalAlignment(SwingConstants.CENTER);
		lieuC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lieuC.setColumns(10);
		contentPane.add(lieuC);
		
		JLabel lblNPermis = new JLabel("N\u00B0 permis :");
		lblNPermis.setBounds(95, 481, 134, 31);
		lblNPermis.setForeground(Color.WHITE);
		lblNPermis.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNPermis);
		
		nPermis = new JTextField();
		nPermis.setBounds(215, 485, 259, 25);
		nPermis.setHorizontalAlignment(SwingConstants.CENTER);
		nPermis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nPermis.setColumns(10);
		contentPane.add(nPermis);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(95, 519, 116, 31);
		lblAdresse.setForeground(Color.WHITE);
		lblAdresse.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblAdresse);
		
		JLabel lblDateEtLieu = new JLabel("Date et lieu de naissance du client :");
		lblDateEtLieu.setBounds(95, 371, 379, 31);
		lblDateEtLieu.setForeground(Color.WHITE);
		lblDateEtLieu.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblDateEtLieu);
		
		adr = new JTextField();
		adr.setBounds(193, 523, 281, 25);
		adr.setHorizontalAlignment(SwingConstants.CENTER);
		adr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		adr.setColumns(10);
		contentPane.add(adr);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setBounds(95, 557, 73, 31);
		lblVille.setForeground(Color.WHITE);
		lblVille.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblVille);
		
		ville = new JTextField();
		ville.setBounds(158, 561, 316, 25);
		ville.setHorizontalAlignment(SwingConstants.CENTER);
		ville.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ville.setColumns(10);
		contentPane.add(ville);
		
		JLabel lblNTelephone = new JLabel("N\u00B0 telephone :");
		lblNTelephone.setBounds(95, 595, 170, 31);
		lblNTelephone.setForeground(Color.WHITE);
		lblNTelephone.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNTelephone);
		
		tel = new JTextField();
		tel.setBounds(239, 599, 235, 25);
		tel.setHorizontalAlignment(SwingConstants.CENTER);
		tel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tel.setColumns(10);
		contentPane.add(tel);
		
		lblReservationN = new JLabel("Reservation n\u00B0 : ");
		lblReservationN.setBounds(617, 72, 160, 31);
		lblReservationN.setForeground(Color.WHITE);
		lblReservationN.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblReservationN);
		
		numR = new JTextField();
		numR.setBounds(774, 76, 222, 25);
		numR.setHorizontalAlignment(SwingConstants.CENTER);
		numR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		numR.setColumns(10);
		contentPane.add(numR);
		numR.setText(Integer.toString(cont.listeReservations.size()+1));
		
		lblCoordonnesClient = new JLabel("Coordonn\u00E9es client :");
		lblCoordonnesClient.setBounds(95, 237, 334, 31);
		lblCoordonnesClient.setForeground(Color.WHITE);
		lblCoordonnesClient.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblCoordonnesClient);
		
		lblCoordonnesVehicule = new JLabel("Coordonn\u00E9es vehicule :");
		lblCoordonnesVehicule.setBounds(617, 252, 375, 31);
		lblCoordonnesVehicule.setForeground(Color.WHITE);
		lblCoordonnesVehicule.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblCoordonnesVehicule);
		
		lblReservation = new JLabel("Reservation :");
		lblReservation.setBounds(617, 30, 235, 31);
		lblReservation.setForeground(Color.WHITE);
		lblReservation.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblReservation);
		
		lblJours = new JLabel("Jours");
		lblJours.setBounds(934, 144, 62, 31);
		lblJours.setForeground(Color.WHITE);
		lblJours.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblJours);
		
		jr = new JTextField();
		jr.setBounds(651, 112, 82, 25);
		jr.setHorizontalAlignment(SwingConstants.CENTER);
		jr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jr.setColumns(10);
		contentPane.add(jr);
		
		label_6 = new JLabel("M : ");
		label_6.setBounds(743, 108, 35, 31);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label_6);
		
		mr = new JTextField();
		mr.setBounds(774, 112, 82, 25);
		mr.setHorizontalAlignment(SwingConstants.CENTER);
		mr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mr.setColumns(10);
		contentPane.add(mr);
		
		label_7 = new JLabel("A : ");
		label_7.setBounds(866, 108, 35, 31);
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label_7);
		
		ar = new JTextField();
		ar.setBounds(894, 112, 102, 25);
		ar.setHorizontalAlignment(SwingConstants.CENTER);
		ar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ar.setColumns(10);
		contentPane.add(ar);
		
		lblDelaiDeReservation = new JLabel("Delai de reservation : ");
		lblDelaiDeReservation.setBounds(617, 144, 198, 31);
		lblDelaiDeReservation.setForeground(Color.WHITE);
		lblDelaiDeReservation.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblDelaiDeReservation);
		
		delaiR = new JTextField();
		delaiR.setBounds(820, 148, 102, 25);
		delaiR.setHorizontalAlignment(SwingConstants.CENTER);
		delaiR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		delaiR.setColumns(10);
		contentPane.add(delaiR);
		
		lblLocdz = new JLabel("Agence LocDz\r\n");
		lblLocdz.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocdz.setBounds(61, 48, 453, 112);
		lblLocdz.setForeground(Color.WHITE);
		lblLocdz.setFont(new Font("Tahoma", Font.BOLD, 62));
		contentPane.add(lblLocdz);
		
		panel = new JPanel();
		panel.setBounds(583, 11, 445, 196);
		panel.setBackground(new Color(0, 153, 153));
		contentPane.add(panel);
		panel.setLayout(null);
		
		label = new JLabel("J : ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(36, 96, 35, 31);
		panel.add(label);
		
		panel_1 = new JPanel();
		panel_1.setBounds(61, 48, 453, 112);
		panel_1.setBackground(new Color(0, 153, 153));
		contentPane.add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBounds(61, 220, 453, 440);
		panel_2.setBackground(new Color(0, 153, 153));
		contentPane.add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBounds(583, 237, 445, 302);
		panel_3.setBackground(new Color(0, 153, 153));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		lblNVehicule = new JLabel("Couleur :");
		lblNVehicule.setBounds(32, 157, 90, 31);
		panel_3.add(lblNVehicule);
		lblNVehicule.setForeground(Color.WHITE);
		lblNVehicule.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		couleur = new JTextField();
		couleur.setBounds(127, 161, 281, 25);
		panel_3.add(couleur);
		couleur.setHorizontalAlignment(SwingConstants.CENTER);
		couleur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		couleur.setColumns(10);
		
		lblMarque = new JLabel("Marque :");
		lblMarque.setBounds(32, 73, 108, 31);
		panel_3.add(lblMarque);
		lblMarque.setForeground(Color.WHITE);
		lblMarque.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		marque = new JTextField();
		marque.setBounds(127, 77, 281, 25);
		panel_3.add(marque);
		marque.setHorizontalAlignment(SwingConstants.CENTER);
		marque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		marque.setColumns(10);
		
		lblNom = new JLabel("Nom : ");
		lblNom.setBounds(32, 115, 82, 31);
		panel_3.add(lblNom);
		lblNom.setForeground(Color.WHITE);
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		nomV = new JTextField();
		nomV.setBounds(93, 119, 316, 25);
		panel_3.add(nomV);
		nomV.setHorizontalAlignment(SwingConstants.CENTER);
		nomV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomV.setColumns(10);
		
		lblNombreDePlaces = new JLabel("Nombre de places :");
		lblNombreDePlaces.setBounds(32, 199, 214, 31);
		panel_3.add(lblNombreDePlaces);
		lblNombreDePlaces.setForeground(Color.WHITE);
		lblNombreDePlaces.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		nbp = new JTextField();
		nbp.setBounds(223, 203, 186, 25);
		panel_3.add(nbp);
		nbp.setHorizontalAlignment(SwingConstants.CENTER);
		nbp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nbp.setColumns(10);
		
		lblType = new JLabel("Type :");
		lblType.setBounds(32, 241, 62, 31);
		panel_3.add(lblType);
		lblType.setForeground(Color.WHITE);
		lblType.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		comboBox = new JComboBox();
		comboBox.setBounds(102, 245, 306, 25);
		panel_3.add(comboBox);
		comboBox.setToolTipText("");
		comboBox.addItem("Voitures de tourisme");
		comboBox.addItem("Mini-bus");
		comboBox.addItem("Camions");
		comboBox.addItem("Camion benne");
		comboBox.addItem("Porte voitures");
		comboBox.setSelectedItem(null);
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 153, 153));
		panel_4.setBounds(583, 550, 445, 110);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		btnReserver = new JButton("Reserver");
		btnReserver.setBounds(34, 11, 379, 42);
		panel_4.add(btnReserver);
		btnReserver.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				Control cont = new Control();
				DirecteurCommercial dc = new DirecteurCommercial();
				
				boolean f=false;
				
				String nc = nomC.getText();
				String pc = prenomC.getText();
				String jjc = jc.getText();
				String mmc = mc.getText();
				String aac = ac.getText();
				String a = adr.getText();
				String lc = lieuC.getText();
				String nper = nPermis.getText();
				String v = ville.getText();
				String t = tel.getText();
				
				
				String mrc = marque.getText();
				String nv = nomV.getText();
				String c = couleur.getText();
				String nb = nbp.getText();
				String type = (String) comboBox.getSelectedItem();
				
				
				String nr = numR.getText();
				String jjr = jr.getText();
				String mmr = mr.getText();
				String aar = ar.getText();
				String dr = delaiR.getText();
			
				
				
				if( nc.isEmpty() || pc.isEmpty() || jjc.isEmpty() || mmc.isEmpty() || aac.isEmpty() || a.isEmpty() || lc.isEmpty() || nper.isEmpty() || v.isEmpty() || t.isEmpty() ||  mrc.isEmpty() || nv.isEmpty() || c.isEmpty() || nb.isEmpty() || comboBox.getSelectedItem()==null ||   jjr.isEmpty() || mmr.isEmpty() || aar.isEmpty() || dr.isEmpty()  )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); 
					f=true;
					
				}
				
				
		
				
				if( !cont.textOnly(nc) || !cont.textOnly(pc) || !cont.numbersOnly(jjc) || !cont.numbersOnly(mmc) || !cont.numbersOnly(aac)||  !cont.numbersOnly(nper) || !cont.numbersOnly(t) ||  !cont.numbersOnly(nb) || !cont.textOnly(c) || !cont.numbersOnly(jjr) || !cont.numbersOnly(mmr) || !cont.numbersOnly(aar) || !cont.numbersOnly(dr) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifierles données !"); 
					f=true;	
				}
				
				
				boolean ex=false;
				
				if(f==false)
				{
					DateP dateClient = new DateP(Integer.valueOf(jjc),Integer.valueOf(mmc), Integer.valueOf(aac));
					
					
					DateP dateRes = new DateP(Integer.valueOf(jjr),Integer.valueOf(mmr), Integer.valueOf(aar));
					
					if( cont.testDate(Integer.valueOf(jjc), Integer.valueOf(mmc), Integer.valueOf(aac))== false ||  cont.testDate(Integer.valueOf(jjr), Integer.valueOf(mmr), Integer.valueOf(aar))== false   )
					{
						JOptionPane.showMessageDialog(erreurPanel," Veuillez verifierles données !"); 
					}
					else
					{
						Client client = new Client(nc, pc, dateClient, lc, Integer.valueOf(nper), a, v, t);
						Vehicule vehicule = new Vehicule();
						
						dc.ajouterClient(client, cont.listeClients);
						
						for(int i=0; i<cont.listeVehicule.size() ; i++)
						{
							if( cont.listeVehicule.get(i).getNom().equals(nv) && cont.listeVehicule.get(i).getMarque().equals(mrc) && cont.listeVehicule.get(i).getCouleur().equals(c) && cont.listeVehicule.get(i).getNbPlaces()==Integer.valueOf(nb) && cont.listeVehicule.get(i).getType().equals(type))
							{
								if(cont.listeVehicule.get(i).isLouee()==false)
								{
									ex=true;
									vehicule = cont.listeVehicule.get(i); 
									cont.listeVehicule.get(i).setLouee(true);
									
								}
							}
						}
						
						
						Reservation res = new Reservation(client, vehicule, dateRes, Integer.valueOf(dr));
						if(ex==false)
						{
							JOptionPane.showMessageDialog(erreurPanel," Le vehicule n'existe pas  !");
						}
						else
						{
							Contrat contrat = new Contrat(1,res);
							JOptionPane.showMessageDialog(erreurPanel," Resevation avec succés , Contrat etabli ");
							dc.ajouterContrat(contrat, cont.listeContrats);
	
						}
						
					}
					
					
				
				}
				
				
			}
		});
		btnReserver.setForeground(Color.DARK_GRAY);
		btnReserver.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReserver.setBackground(Color.WHITE);
		
		btnRetour = new JButton("Retour");
		btnRetour.setBounds(138, 64, 182, 35);
		panel_4.add(btnRetour);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetour.setBackground(Color.WHITE);
	}
}
