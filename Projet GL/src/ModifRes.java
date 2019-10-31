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

public class ModifRes extends JFrame {

	private JPanel contentPane;
	private JTextField numR;
	private JTextField jr;
	private JTextField mr;
	private JTextField ar;
	private JTextField delaiR;
	private JTextField numRav;
	private JTextField couleur;
	private JTextField marque;
	private JTextField nomV;
	private JTextField nbp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifRes frame = new ModifRes();
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
	public ModifRes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 950, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNouveauN = new JLabel("Nouveau n\u00B0 : ");
		lblNouveauN.setForeground(Color.WHITE);
		lblNouveauN.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNouveauN.setBounds(44, 283, 130, 31);
		contentPane.add(lblNouveauN);
		
		numR = new JTextField();
		numR.setHorizontalAlignment(SwingConstants.CENTER);
		numR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		numR.setColumns(10);
		numR.setBounds(178, 287, 245, 25);
		contentPane.add(numR);
		
		JLabel lblNouvellesDonnes = new JLabel("Nouvelles donn\u00E9es :");
		lblNouvellesDonnes.setForeground(Color.WHITE);
		lblNouvellesDonnes.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNouvellesDonnes.setBounds(44, 241, 379, 31);
		contentPane.add(lblNouvellesDonnes);
		
		JLabel label_2 = new JLabel("Jours");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(361, 355, 62, 31);
		contentPane.add(label_2);
		
		jr = new JTextField();
		jr.setHorizontalAlignment(SwingConstants.CENTER);
		jr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jr.setColumns(10);
		jr.setBounds(78, 323, 82, 25);
		contentPane.add(jr);
		
		JLabel label_3 = new JLabel("M : ");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(170, 319, 35, 31);
		contentPane.add(label_3);
		
		mr = new JTextField();
		mr.setHorizontalAlignment(SwingConstants.CENTER);
		mr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mr.setColumns(10);
		mr.setBounds(201, 323, 82, 25);
		contentPane.add(mr);
		
		JLabel label_4 = new JLabel("A : ");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(293, 319, 35, 31);
		contentPane.add(label_4);
		
		ar = new JTextField();
		ar.setHorizontalAlignment(SwingConstants.CENTER);
		ar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ar.setColumns(10);
		ar.setBounds(321, 323, 102, 25);
		contentPane.add(ar);
		
		JLabel label_5 = new JLabel("Delai de reservation : ");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(44, 355, 198, 31);
		contentPane.add(label_5);
		
		delaiR = new JTextField();
		delaiR.setHorizontalAlignment(SwingConstants.CENTER);
		delaiR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		delaiR.setColumns(10);
		delaiR.setBounds(247, 359, 102, 25);
		contentPane.add(delaiR);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(10, 222, 445, 196);
		contentPane.add(panel);
		
		JLabel label_6 = new JLabel("J : ");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(36, 96, 35, 31);
		panel.add(label_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 153, 153));
		panel_1.setBounds(10, 112, 445, 99);
		contentPane.add(panel_1);
		
		numRav = new JTextField();
		numRav.setBounds(167, 53, 245, 25);
		panel_1.add(numRav);
		numRav.setHorizontalAlignment(SwingConstants.CENTER);
		numRav.setFont(new Font("Tahoma", Font.PLAIN, 15));
		numRav.setColumns(10);
		
		JLabel label = new JLabel("Nouveau n\u00B0 : ");
		label.setBounds(35, 49, 130, 31);
		panel_1.add(label);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label_7 = new JLabel("Reservation :");
		label_7.setBounds(36, 11, 235, 31);
		panel_1.add(label_7);
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel label_1 = new JLabel("Coordonn\u00E9es vehicule :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_1.setBounds(523, 127, 375, 31);
		contentPane.add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 153, 153));
		panel_2.setBounds(489, 112, 445, 308);
		contentPane.add(panel_2);
		
		JLabel label_8 = new JLabel("Couleur :");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_8.setBounds(32, 157, 90, 31);
		panel_2.add(label_8);
		
		couleur = new JTextField();
		couleur.setHorizontalAlignment(SwingConstants.CENTER);
		couleur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		couleur.setColumns(10);
		couleur.setBounds(127, 161, 281, 25);
		panel_2.add(couleur);
		
		JLabel label_9 = new JLabel("Marque :");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(32, 73, 108, 31);
		panel_2.add(label_9);
		
		marque = new JTextField();
		marque.setHorizontalAlignment(SwingConstants.CENTER);
		marque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		marque.setColumns(10);
		marque.setBounds(127, 77, 281, 25);
		panel_2.add(marque);
		
		JLabel label_10 = new JLabel("Nom : ");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_10.setBounds(32, 115, 82, 31);
		panel_2.add(label_10);
		
		nomV = new JTextField();
		nomV.setHorizontalAlignment(SwingConstants.CENTER);
		nomV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomV.setColumns(10);
		nomV.setBounds(93, 119, 316, 25);
		panel_2.add(nomV);
		
		JLabel label_11 = new JLabel("Nombre de places :");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_11.setBounds(32, 199, 214, 31);
		panel_2.add(label_11);
		
		nbp = new JTextField();
		nbp.setHorizontalAlignment(SwingConstants.CENTER);
		nbp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nbp.setColumns(10);
		nbp.setBounds(223, 203, 186, 25);
		panel_2.add(nbp);
		
		JLabel label_12 = new JLabel("Type :");
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_12.setBounds(32, 241, 62, 31);
		panel_2.add(label_12);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBounds(102, 245, 306, 25);
		panel_2.add(comboBox);
		
		JLabel lblModifierReservation = new JLabel("Modifier reservation");
		lblModifierReservation.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifierReservation.setForeground(Color.WHITE);
		lblModifierReservation.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblModifierReservation.setBounds(10, 11, 924, 43);
		contentPane.add(lblModifierReservation);
		
		JButton btnModifier = new JButton("Modifier\r\n");
		btnModifier.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent e) {
				
				Control cont = new Control();
				DirecteurCommercial dc = new DirecteurCommercial();
				
				boolean f=false;
				
				
				
				String mrc = marque.getText();
				String nv = nomV.getText();
				String c = couleur.getText();
				String nb = nbp.getText();
				String type = (String) comboBox.getSelectedItem();
				
				
				String nrAv = numRav.getText();
				
				String nr = numR.getText();
				String jjr = jr.getText();
				String mmr = mr.getText();
				String aar = ar.getText();
				String dr = delaiR.getText();
				
				if( nrAv.isEmpty() || mrc.isEmpty() || nv.isEmpty() || c.isEmpty() || nb.isEmpty() || comboBox.getSelectedItem()==null ||  nr.isEmpty()|| jjr.isEmpty() || mmr.isEmpty() || aar.isEmpty() || dr.isEmpty()  )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir les données !"); 
					f=true;	
				}
			
				
				if(f==false)
				{
					boolean ff=false;
					if(!cont.numbersOnly(nrAv))
					{
						JOptionPane.showMessageDialog(erreurPanel," Verifiez les données !"); 
						ff=true;
					}
					if( mrc.isEmpty()==false && nv.isEmpty()==false && c.isEmpty()==false && !cont.textOnly(c) &&  nb.isEmpty()==false && !cont.numbersOnly(nb) && nr.isEmpty()==false )
					{
						JOptionPane.showMessageDialog(erreurPanel," Verifiez les données !"); 
						ff=true;
					}
					
					if(ff=false)
					{
						boolean ex=false;
						boolean ex1=false;
						for(int i=0 ; i<cont.listeReservations.size() ; i++)
						{
							if(cont.listeReservations.get(i).getNumReservation()==Integer.valueOf(nrAv))
							{
								ex=true;
								
								Vehicule vehicule = new Vehicule();
							
								for(int j=0; j<cont.listeVehicule.size() ;j++)
								{
									if( cont.listeVehicule.get(j).getNom().equals(nv) && cont.listeVehicule.get(j).getMarque().equals(mrc) && cont.listeVehicule.get(j).getCouleur().equals(c) && cont.listeVehicule.get(j).getNbPlaces()==Integer.valueOf(nb) && cont.listeVehicule.get(j).getType().equals(type))
									{
										
											ex1=true;
											vehicule = cont.listeVehicule.get(j); 
											cont.listeVehicule.get(j).setLouee(true);
									}
									if(ex1==false)
									{
										JOptionPane.showMessageDialog(erreurPanel," Ce vehicule n'est pas disponible!");
									}
								}
								if(ex1==true)
								{
									Client client = new Client();
									client = cont.listeReservations.get(i).getClient();
									
									DateP d = new DateP(Integer.valueOf(jjr), Integer.valueOf(aar), Integer.valueOf(aar));
									
									cont.listeReservations.get(i).setClient(client);
									cont.listeReservations.get(i).setDateReservation(d);
									cont.listeReservations.get(i).setDelai(Integer.valueOf(dr));
									cont.listeReservations.get(i).setNumReservation(Integer.valueOf(nr));
									cont.listeReservations.get(i).setVehicule(vehicule);
									
									JOptionPane.showMessageDialog(erreurPanel," Reservation modifiée avec succés");
									
								}
								
								
								
								
								
								
							}
						}
					}
					
					
				}
			}
		});
		btnModifier.setForeground(Color.DARK_GRAY);
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifier.setBackground(Color.WHITE);
		btnModifier.setBounds(235, 438, 477, 53);
		contentPane.add(btnModifier);
		
		JButton button = new JButton("Retour");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(390, 502, 155, 45);
		contentPane.add(button);
	}
}
